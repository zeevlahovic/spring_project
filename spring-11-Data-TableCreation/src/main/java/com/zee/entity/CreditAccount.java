package com.zee.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    @Entity
    private BigDecimal creditLimit;

}
