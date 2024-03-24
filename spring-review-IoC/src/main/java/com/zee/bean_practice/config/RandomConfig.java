package com.zee.bean_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {

    @Bean
    public static String string(){
        return "Welcome to Cydeo";
    }
    @Bean
    public static String string2(){
        return "Spring Core Practice";
    }






}
