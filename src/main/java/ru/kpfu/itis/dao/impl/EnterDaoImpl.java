package ru.kpfu.itis.dao.impl;

import ru.kpfu.itis.dao.EnterDao;
import ru.kpfu.itis.entity.Enter;
import ru.kpfu.itis.util.ConnectionManager;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnterDaoImpl implements EnterDao {

    private Connection connection = ConnectionManager.getConnection();

    private static final String SAVE_SQL = "INSERT INTO enters_test1 (user_id, success) VALUES (?, ?)";

    @Override
    public void save(Enter enter) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SAVE_SQL)) {
            preparedStatement.setLong(1, enter.getUserId());
            preparedStatement.setBoolean(2, enter.isSuccess());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
