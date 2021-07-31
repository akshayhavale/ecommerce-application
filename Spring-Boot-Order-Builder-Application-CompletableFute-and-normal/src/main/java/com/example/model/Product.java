package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "QTY")
    private Integer quantity;

    @Column(name = "PRODUCT_PRICE")
    private Double price;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID")
    private Shop shop;

    public Product(String productName, Integer qty, Double price, Shop shop) {
        this.name = productName;
        this.quantity = qty;
        this.price = price;
        this.shop = shop;
    }
}
