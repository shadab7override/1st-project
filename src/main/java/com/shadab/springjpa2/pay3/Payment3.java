package com.shadab.springjpa2.pay3;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment3 {

    @Id
    private int id;
    private double amount;
}