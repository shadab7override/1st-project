/*
package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductVariation {
    @Id
    private Long id;

    private String qualityAvailabe;
    private Double price;

   @ManyToOne
   @JoinColumn(name="uid")
   private Set<OrderProduct> orderProducts;

   @OneToOne(mappedBy = "ProductVariation")
   private Long productId;


    public boolean isActive(){
        return true;
    }

    public ProductVariation(Long id, Long productId, String qualityAvailabe, Double price, CategoryMetaField metaField, String primaryImageName) {
        this.id = id;
        this.productId = productId;
        this.qualityAvailabe = qualityAvailabe;
        this.price = price;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getQualityAvailabe() {
        return qualityAvailabe;
    }

    public void setQualityAvailabe(String qualityAvailabe) {
        this.qualityAvailabe = qualityAvailabe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



}
*/
