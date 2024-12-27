package ru.kpfu.itis.dao.impl;

import ru.kpfu.itis.dao.UserDao;
import ru.kpfu.itis.entity.User;
import ru.kpfu.itis.util.ConnectionManager;

import java.sql.*;

public class UserDaoImpl implements UserDao {

    private Connection connection = ConnectionManager.getConnection();

    private static final String SAVE_SQL = "INSERT INTO users_test1 (username, email, password) VALUES (?, ?, ?)";
    private static final String GET_USER_MORE_INFO_BY_EMAIL = "SELECT id, username, email, password FROM users_test1 WHERE username = ?";

    @Override
    public void addUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SAVE_SQL)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getUserByUsername(String username) {
        User user = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_MORE_INFO_BY_EMAIL)) {
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }
}
