/*
package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class OrderProduct {
    @Id
    private Long id;
    private Long orderId;
    private String quality;
    private Double price;
    private Long productValidationId;

    @OneToOne(mappedBy = "OrderProduct")
    private Order order;

    @OneToMany(mappedBy = "OrderProduct")
    private Set<ProductVariation> productVariations;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "orderProductId")
    private OrderStatus orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getProductValidationId() {
        return productValidationId;
    }

    public void setProductValidationId(Long productValidationId) {
        this.productValidationId = productValidationId;
    }

    public OrderProduct(Long id, Long orderId, String quality, Double price, Long productValidationId) {
        this.id = id;
        this.orderId = orderId;
        this.quality = quality;
        this.price = price;
        this.productValidationId = productValidationId;
    }
}
*/
