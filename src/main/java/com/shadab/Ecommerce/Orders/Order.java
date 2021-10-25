/*
package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Order {
    @Id
    private Long id;
    private Long customerUserId;
    private Double amountPaid;
    private String date;
    private String paymentMethod;
    private String   customerAddressCity;
    private String   customerAddressState;
    private String   customerAddressCountry;
    private String   customerAddressCityCountryLine;
    private Integer  customerAddressZipcode;
    private String   customerAddressLabel;

    @OneToOne(mappedBy = "Order")
    private Customer customers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private OrderProduct orderProduct;

    public Order(Long id, Long customerUserId, Double amountPaid, String date, String paymentMethod, String customerAddressCity, String customerAddressState, String customerAddressCountry, String customerAddressCityCountryLine, Integer customerAddressZipcode, String customerAddressLabel) {
        this.id = id;
        this.customerUserId = customerUserId;
        this.amountPaid = amountPaid;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.customerAddressCity = customerAddressCity;
        this.customerAddressState = customerAddressState;
        this.customerAddressCountry = customerAddressCountry;
        this.customerAddressCityCountryLine = customerAddressCityCountryLine;
        this.customerAddressZipcode = customerAddressZipcode;
        this.customerAddressLabel = customerAddressLabel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Long customerUserId) {
        this.customerUserId = customerUserId;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerAddressCity() {
        return customerAddressCity;
    }

    public void setCustomerAddressCity(String customerAddressCity) {
        this.customerAddressCity = customerAddressCity;
    }

    public String getCustomerAddressState() {
        return customerAddressState;
    }

    public void setCustomerAddressState(String customerAddressState) {
        this.customerAddressState = customerAddressState;
    }

    public String getCustomerAddressCountry() {
        return customerAddressCountry;
    }

    public void setCustomerAddressCountry(String customerAddressCountry) {
        this.customerAddressCountry = customerAddressCountry;
    }

    public String getCustomerAddressCityCountryLine() {
        return customerAddressCityCountryLine;
    }

    public void setCustomerAddressCityCountryLine(String customerAddressCityCountryLine) {
        this.customerAddressCityCountryLine = customerAddressCityCountryLine;
    }

    public Integer getCustomerAddressZipcode() {
        return customerAddressZipcode;
    }

    public void setCustomerAddressZipcode(Integer customerAddressZipcode) {
        this.customerAddressZipcode = customerAddressZipcode;
    }

    public String getCustomerAddressLabel() {
        return customerAddressLabel;
    }

    public void setCustomerAddressLabel(String customerAddressLabel) {
        this.customerAddressLabel = customerAddressLabel;
    }
}
*/
