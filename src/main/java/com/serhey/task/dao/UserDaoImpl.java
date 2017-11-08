package com.serhey.task.dao;

import com.serhey.task.entity.User;
import com.serhey.task.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao{

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<User> getAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query (sql, new UserMapper());
    }
}
