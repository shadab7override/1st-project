package com.shadab.springjpa2;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "paymentMode", discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {

    @Id
    private int id;
    private double amount;
}