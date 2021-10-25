/*
package com.shadab.Ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Cart {
    @Id
    private Long customerUserId;
     private Integer quantity;

     private Integer productVariationId;
     @OneToOne(mappedBy = "Cart")
     private Customer customer;


     public boolean isWishListItem(){
         return true;
     }

    public Cart(Long customerUserId, Integer quantity, Integer productVariationId) {
        this.customerUserId = customerUserId;
        this.quantity = quantity;
        this.productVariationId = productVariationId;
    }

    public Long getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Long customerUserId) {
        this.customerUserId = customerUserId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(Integer productVariationId) {
        this.productVariationId = productVariationId;
    }
}
*/
