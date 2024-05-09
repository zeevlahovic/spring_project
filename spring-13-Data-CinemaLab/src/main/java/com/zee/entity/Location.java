package com.zee.entity;


import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Location extends BaseEntity {

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String postalCode;
    private String country;
    private String state;
    private String city;
    private String address;

}
