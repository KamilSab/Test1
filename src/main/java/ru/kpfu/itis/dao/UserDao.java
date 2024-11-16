package ru.kpfu.itis.dao;

import ru.kpfu.itis.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User findUserByUsername(String username);

    void logAuthAttempt(String username, boolean success, String timestamp);
}
