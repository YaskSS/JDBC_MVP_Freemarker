package com.serhey.task.service;

import com.serhey.task.entity.User;

import java.util.List;

public interface UserService {

    void  saveUser(User user);

    User getById(int id);

    List<User> findAll();

    void update(User user);

    void deleteUser(int id);
}
