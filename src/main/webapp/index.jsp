<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <h1>Авторизация</h1>
  <form action="/login" method="post">
    <label for="username">Имя пользователя:</label>
    <input type="text" id="username" name="username">
    <br>
    <label for="password">Пароль:</label>
    <input type="password" id="password" name="password">
    <br>
    <input type="submit" value="Войти">
  </form>
  <br>
  <a href="/register">Регистрация</a>
</body>
</html>