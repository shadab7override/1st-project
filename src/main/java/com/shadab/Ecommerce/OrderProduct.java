/*
package com.shadab.Ecommerce;

import javax.persistence.*;

@Entity
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    private Double price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderId")
    private Order orders;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ProductVariationId")
    private ProductVariation productVariation;
 */
/*  @OneToOne(mappedBy = "orderProduct")
    private OrderStatus orderStatus;*//*



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }
}
*/
