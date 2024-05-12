package com.zee.entity;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
public class Genre extends BaseEntity {

    private String name;
}
