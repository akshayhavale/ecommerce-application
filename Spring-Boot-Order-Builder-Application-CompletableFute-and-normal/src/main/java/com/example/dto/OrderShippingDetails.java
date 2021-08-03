package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrderShippingDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6018942892029578358L;
	private AddressDto deliveryAddress;
	private AddressDto pickUpaddress;

}
