/*
package com.shadab.Ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Seller {
    @Id
    private Long userId;
    private Double gst;
    private String companyContact;
    private String companyName;

    @ManyToOne
    @JoinColumn(name="uid")
    private Set<User> user;

    @ManyToOne
    @JoinColumn(name="id")
    private Set<Product> products;

    public Seller(Long userId, Double gst, String companyContact, String companyName) {
        this.userId = userId;
        this.gst = gst;
        this.companyContact = companyContact;
        this.companyName = companyName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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
*/
