package com.serhey.task.config;

import com.serhey.task.dao.UserDao;
import com.serhey.task.dao.UserDaoImpl;
import com.serhey.task.service.UserService;
import com.serhey.task.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/task?useSell=false");
        dataSource.setUsername("servicemy");
        dataSource.setPassword("321rayan");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDaoImpl(getJdbcTemplate() );
    }

    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
}
