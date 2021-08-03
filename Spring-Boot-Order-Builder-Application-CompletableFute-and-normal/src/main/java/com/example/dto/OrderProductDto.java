package com.example.dto;

import java.io.Serializable;

import com.example.model.ShippingDetails;

import lombok.Data;

@Data
public class OrderProductDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3380594022483468116L;
	private ReadableProduct product;
	private Double subTotal;
}
