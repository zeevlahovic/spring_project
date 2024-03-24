package com.zee.bean_practice.config;

import com.zee.bean_practice.employee.FullTimeEmployee;
import com.zee.bean_practice.employee.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public static FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean
    public static PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }

}
