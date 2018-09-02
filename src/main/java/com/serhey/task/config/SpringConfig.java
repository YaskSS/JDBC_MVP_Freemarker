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

    private final String URL = "jdbc:mysql://localhost:3306/users_spring?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USER_NAME = "root";
    private final String USER_PASSWORD = "root";

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(URL);
        dataSource.setUsername(USER_NAME);
        dataSource.setPassword(USER_PASSWORD);
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
