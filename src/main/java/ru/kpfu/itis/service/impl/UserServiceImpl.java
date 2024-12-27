package ru.kpfu.itis.service.impl;

import ru.kpfu.itis.dao.UserDao;
import ru.kpfu.itis.dao.impl.UserDaoImpl;
import ru.kpfu.itis.entity.User;
import ru.kpfu.itis.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public boolean authenticate(String username, String password) {
        User user = userDao.getUserByUsername(username);

        if (user != null) {
            return user.getPassword().equals(password);
        } else {
            return false;
        }
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }
}
