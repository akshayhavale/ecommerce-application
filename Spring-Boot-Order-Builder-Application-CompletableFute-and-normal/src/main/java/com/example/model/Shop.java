package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SHOP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOP_ID")
    private Long id;

    @Column(name = "SHOP_NAME")
    private String shopName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "PICKUP_ADDRESS_ID")
    private PickUpAddress pickUpAddress;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "shop")
    private Set<Product> product = new HashSet<>();

    public Shop(String shopName, PickUpAddress pickUpAddress) {
        this.shopName = shopName;
        this.pickUpAddress = pickUpAddress;
    }
}
