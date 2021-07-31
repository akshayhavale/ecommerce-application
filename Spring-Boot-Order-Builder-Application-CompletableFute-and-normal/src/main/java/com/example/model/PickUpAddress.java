package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PICKUP_ADDRESS")
public class PickUpAddress extends Address {

    public PickUpAddress(String city) {
        super(city);
    }
}
