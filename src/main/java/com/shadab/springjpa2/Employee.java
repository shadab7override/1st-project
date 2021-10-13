package com.shadab.springjpa2;

import javax.persistence.*;

@Entity
//@Table(name="employee")
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="empId,")
    private Integer id;

    @Column(name="empFirstName")
    private String firstname;

    @Column(name="empLastName,")
    private String lasttname;

    @Column(name="empSalary")
    private Integer salary;

    @Column(name="empAge")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
