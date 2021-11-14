package com.shadab.Ecommerce;


import javax.persistence.*;

//Customer

@Entity
@Table(name ="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private String sname;
    private String scity;

    public Long getSid() {
        return sid;
    }
    public void setSid(Long sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getScity() {
        return scity;
    }
    public void setScity(String scity) {
        this.scity = scity;
    }


}