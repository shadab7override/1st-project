package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private Double gst;
    private String companyContact;
    private String companyName;
    private String password;
    private String Address;
    
    public Seller(Long userId, Double gst, String companyContact, String companyName, String password, String address) {

        this.userId = userId;
        this.gst = gst;
        this.companyContact = companyContact;
        this.companyName = companyName;
        this.password = password;
        this.Address = address;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
    /*
    @OneToOne
    @JoinColumn(name="userId")
    private User user;

  @ManyToMany
    @JoinColumn(name="id")
    private Set<Product> products;
*/


   

    public Double getGst() {
        return gst;
    }

    public void setGst(Double gst) {
        this.gst = gst;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
