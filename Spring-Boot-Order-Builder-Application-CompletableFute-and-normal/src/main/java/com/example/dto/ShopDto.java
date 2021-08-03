package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ShopDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5005955866684097648L;

	private Long id;

	private String shopName;

	private String phoneNumber;

	private AddressDto address;

}
