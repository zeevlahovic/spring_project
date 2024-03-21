package com.zee.spring07springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZeeApplication {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(ZeeApplication.class, args);
    }


}
