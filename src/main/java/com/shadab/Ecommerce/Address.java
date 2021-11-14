package com.shadab.Ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private Long id;
    private String  city;
    private String  state;
    private String  country;
    private String  addressLine;
    private Integer zipId;
    private String  label;


    @OneToOne(mappedBy="address")
    private User user_id;

    public Address(Long id, String city, String state, String country, String addressLine, Integer zipId, String label, User user_id) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
        this.addressLine = addressLine;
        this.zipId = zipId;
        this.label = label;
        this.user_id = user_id;
    }

    public User getUserId() {
        return user_id;
    }

    public void setUserId(User userId) {
        this.user_id = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public Integer getZipId() {
        return zipId;
    }

    public void setZipId(Integer zipId) {
        this.zipId = zipId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
