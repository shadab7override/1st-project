/*
package com.shadab.Ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProductReview {
    @Id
    @ManyToMany(mappedBy = "ProductReview")
    private Long  customerUserId;
    private String review;
    private Integer rating;
    @ManyToMany(mappedBy = "ProductReview")
    private Long productId;

    public ProductReview(Long customerUserId, String review, Integer rating, Long productId) {
        this.customerUserId = customerUserId;
        this.review = review;
        this.rating = rating;
        this.productId = productId;
    }

    public Long getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Long customerUserId) {
        this.customerUserId = customerUserId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
*/
