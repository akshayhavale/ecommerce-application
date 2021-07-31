package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "ORDERED_QTY")
    private Integer orderedQuantity;

    @Column(name = "ORDERED_TOTAL")
    private Double orderTotal;

    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orders")
    private Set<OrderProduct> orderProducts = new HashSet<>();

    public Orders(Integer orderedQuantity, Double orderTotal, Customer customer, Set<OrderProduct> orderProducts) {
        this.orderedQuantity = orderedQuantity;
        this.orderTotal = orderTotal;
        this.customer = customer;
        this.orderProducts = orderProducts;
    }
}
