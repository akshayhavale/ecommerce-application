package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ReadableProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5249300958132237611L;

	private Long id;

	private String name;

	private String skuCode;

	private Integer quantity;

	private Double price;

	private SellerInfoDto sellerInformation;

}
