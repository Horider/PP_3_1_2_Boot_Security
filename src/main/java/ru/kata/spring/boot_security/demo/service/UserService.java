package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user, String[] role);

    void deleteUser(Long id);

    User getUser(Long id);

    User getUserByName(String name);

    void editUser(User user);
}

