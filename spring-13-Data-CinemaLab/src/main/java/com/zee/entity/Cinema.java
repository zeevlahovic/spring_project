package com.zee.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cinema extends BaseEntity {

    private String name;
    private String sponsoredName;

    @ManyToOne
    private Location location;
}
