package com.zee.stereotype_annotations;

import com.zee.stereotype_annotations.config.config;
import com.zee.stereotype_annotations.model.DataStructure;
import com.zee.stereotype_annotations.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        Microservice microservice = context.getBean(Microservice.class);
        DataStructure dataStructure = context.getBean(DataStructure.class);

        microservice.getTotalHours();
        dataStructure.getTotalHours();

    }
}
