package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_PRODUCT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_PRODUCT_ID")
    private Long id;

    @Column(name = "ORDER_PRICE")
    private Double orderPrice;

    @Column(name = "ORDER_QTY")
    private Integer orderQty;

    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIPPING_DETAILS_ID")
    private ShippingDetails shippingDetails;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDERS_ID")
    private Orders orders;

    public OrderProduct(Double orderPrice, Integer orderQty, Product product, ShippingDetails shippingDetails) {
        this.orderPrice = orderPrice;
        this.orderQty = orderQty;
        this.product = product;
        this.shippingDetails = shippingDetails;
    }

}
