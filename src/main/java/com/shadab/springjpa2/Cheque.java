package com.shadab.springjpa2;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("cq")
public class Cheque extends Payment {

    private String chequeNumber;
}