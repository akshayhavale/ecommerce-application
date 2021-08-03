package com.example.dto;

import java.io.Serializable;

import com.example.model.ShippingDetails;

import lombok.Data;

@Data
public class OrderProductDto implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 721447278482994766L;

	private ReadableProduct product;
	private Double subTotal;
	private ShippingDetails shippingDetails;

}
