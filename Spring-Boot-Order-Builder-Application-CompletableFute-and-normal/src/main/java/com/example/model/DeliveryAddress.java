package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY_ADDRESS")
public class DeliveryAddress extends Address {
    public DeliveryAddress(String city) {
        super(city);
    }
}
