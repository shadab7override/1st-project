/*
package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    private Long id;

    private Long sellerUserId;
    private String name;
    private String description;
    private Long categoryId;

    @OneToMany(mappedBy = "Product")
    private Set<Seller> sellers;

    @OneToMany(mappedBy = "Category")
    private Set<Category> categories;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "productId")
    private ProductVariation productVariation;

    @ManyToMany
    @JoinTable(
            name = "CategoryMetaFieldValues",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "customerUserId"))
    private Set<ProductReview> productReviews;


    public boolean isCancdeled(){
        return true;
    }
    public boolean isReturnable(){
        return true;
    }
    private String brand(){
        return "Nike";
    }
    public boolean isActive(){
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Product(Long id, Long sellerUserId, String name, String description, Long categoryId) {
        this.id = id;
        this.sellerUserId = sellerUserId;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
    }
}
*/
