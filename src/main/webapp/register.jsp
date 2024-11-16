<%--
  Created by IntelliJ IDEA.
  User: Kamil
  Date: 16.11.2024
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
    <h1>Регистрация</h1>
    <form action="/register" method="post">
        <label for="username">Имя пользователя:</label>
        <input type="text" id="username" name="username">
        <br>
        <label for="password">Пароль:</label>
        <input type="password" id="password" name="password">
        <br>
        <input type="submit" value="Зарегистрироваться">
    </form>
</body>
</html>
