package com.shadab.Ecommerce;

import org.apache.ibatis.annotations.One;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    @Column(nullable = false,unique = true,length = 45)
    private String  email;
    @Column(nullable = false,length = 20)
    private String firstName;
    @Column(nullable = false,length = 20)
    private String middleName;
    @Column(nullable = false,length = 20)
    private String lastName;
    @Column(nullable = false,length = 64)
    private String password;

   /* @ManyToMany(mappedBy = "User")
    private Set<Role> roles;

    @OneToMany(mappedBy = "User")
    private Set<Seller> sellers;

    @OneToMany(mappedBy = "User")
    private Set<Customer> customers;*/

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String uEmail) {
        this.email = uEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean isDeleted(){
        return true;
    }
    public boolean isActive(){
        return true;
    }

    public boolean isExpired(){
        return true;
    }
    public boolean isLocked(){
        return true;
    }

  public void inValidAttemptCount(){

  }


}
