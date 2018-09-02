package com.serhey.task.dao;

import com.serhey.task.entity.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getById(int id);

    List<User> getAll();

    void deleteUser(int id);

    void update(User user);
}
