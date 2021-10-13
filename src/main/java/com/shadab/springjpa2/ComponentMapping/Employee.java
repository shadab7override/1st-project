package com.shadab.springjpa2.ComponentMapping;


import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    private Integer id;
    private String name;
    @Embedded
    private Address address;
}