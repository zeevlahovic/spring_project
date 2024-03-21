package com.zee.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Comment {
    private String author;
    private String text;
}
