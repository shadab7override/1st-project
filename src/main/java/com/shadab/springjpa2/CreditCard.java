package com.shadab.springjpa2;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment {

    private String creditCard;
}