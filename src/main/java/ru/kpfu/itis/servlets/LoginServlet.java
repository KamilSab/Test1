package ru.kpfu.itis.servlets;


import ru.kpfu.itis.dao.impl.UserDaoImpl;
import ru.kpfu.itis.entity.Enter;
import ru.kpfu.itis.service.EnterService;
import ru.kpfu.itis.service.UserService;
import ru.kpfu.itis.service.impl.EnterServiceImpl;
import ru.kpfu.itis.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    private EnterService enterService = new EnterServiceImpl();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (userService.authenticate(username, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", username);
            resp.sendRedirect("profile.jsp");
            enterService.save(new Enter(
                    userService.getUserByUsername(username).getId(),
                    true
            ));
        } else {
            resp.sendRedirect("index.jsp");
            enterService.save(new Enter(
                    userService.getUserByUsername(username).getId(),
                    false
            ));
        }
    }
}
