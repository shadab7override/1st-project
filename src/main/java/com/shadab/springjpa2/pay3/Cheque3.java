package com.shadab.springjpa2.pay3;

import com.shadab.springjpa2.pay3.Payment3;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Cheque3 extends Payment3 {

    private String chequeNumber;
}