package com.zee.stereotype_annotations.model;


import org.springframework.stereotype.Component;

@Component
public class DataStructure {

    private ExtraHours extraHours;


    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }
    public  void getTotalHours(){
        System.out.println("total hours: " + 45);
    }

}
