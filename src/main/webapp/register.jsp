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
        <label for="email">Почта:</label>
        <input type="text" id="email" name="email">
        <br>
        <label for="password">Пароль:</label>
        <input type="password" id="password" name="password">
        <br>
        <input type="submit" value="Зарегистрироваться">
    </form>
</body>
</html>
