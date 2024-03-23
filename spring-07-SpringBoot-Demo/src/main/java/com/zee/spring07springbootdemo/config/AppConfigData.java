package com.zee.spring07springbootdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class AppConfigData {

    @Value("${myName}")
    private String userName;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

}

