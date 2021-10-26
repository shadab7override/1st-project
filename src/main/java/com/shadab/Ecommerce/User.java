package com.shadab.Ecommerce;

import org.apache.ibatis.annotations.One;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
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

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

 /*   @OneToOne(mappedBy = "users")
    private Customer customers;

   @OneToOne
   @JoinColumn(name="user_address")
   private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToOne(mappedBy = "user")
    private Seller sellers;*/


 /*   @OneToOne(mappedBy = "user")
    private Role roles;
*/






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
