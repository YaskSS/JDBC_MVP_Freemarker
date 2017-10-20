package com.serhey.task.config;

import com.serhey.task.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public TestBean getTextBean(){
        return new TestBean("hello Bean");
    }
}
