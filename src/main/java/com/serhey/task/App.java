package com.serhey.task;

import com.serhey.task.config.SpringConfig;
import com.serhey.task.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        String name = bean.getName();
        System.out.printf(name);
    }
}
