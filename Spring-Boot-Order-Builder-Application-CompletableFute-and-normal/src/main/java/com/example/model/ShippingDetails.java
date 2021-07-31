package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "SHIPPING_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPPING_ID")
    private Long id;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PICKUP_ADDRESS_ID")
    private PickUpAddress pickUpAddress;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ADDRESS_ID")
    private DeliveryAddress deliveryAddress;

    @Column(name = "SHIPPING_CHARGE")
    private Double ShippingCharge;

    public ShippingDetails(PickUpAddress pickUpAddress, DeliveryAddress deliveryAddress, Double shippingCharge) {
        this.pickUpAddress = pickUpAddress;
        this.deliveryAddress = deliveryAddress;
        this.ShippingCharge = shippingCharge;
    }

}
