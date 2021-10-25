/*
package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    private Long userId;
    private Long contact;

    @ManyToOne
    @JoinColumn(name="uid")
    private Set<User> users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "userid")
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "customerUserId")
    private Cart cart;


    public Customer(Long userId, Long contact) {
        this.userId = userId;
        this.contact = contact;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }
}
*/
