package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.User;

public interface UserService {

    void addUser(User user);
    boolean authenticate(String username, String password);
    User getUserByUsername(String username);
}
