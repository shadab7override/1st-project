package com.shadab.springjpa2.pay2;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Cheque2 extends Payment2 {

    private String chequeNumber;
}