package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PICKUP_ADDRESS")
public class PickUpAddress extends Address {

    public PickUpAddress(String city) {
        super(city);
    }
}
