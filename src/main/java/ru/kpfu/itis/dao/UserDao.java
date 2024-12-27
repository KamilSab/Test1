package ru.kpfu.itis.dao;

import ru.kpfu.itis.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    User getUserByUsername(String username);
}
