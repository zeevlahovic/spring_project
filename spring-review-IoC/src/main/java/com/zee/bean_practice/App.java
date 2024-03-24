package com.zee.bean_practice;

import com.zee.bean_practice.config.AppConfig;
import com.zee.bean_practice.config.RandomConfig;
import com.zee.bean_practice.employee.FullTimeEmployee;
import com.zee.bean_practice.employee.PartTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, RandomConfig.class);

        container.getBean(FullTimeEmployee.class);
        container.getBean(PartTimeEmployee.class);

        System.out.println(container.getBean("string",String.class));
        System.out.println(container.getBean("string2",String.class));
    }





}
