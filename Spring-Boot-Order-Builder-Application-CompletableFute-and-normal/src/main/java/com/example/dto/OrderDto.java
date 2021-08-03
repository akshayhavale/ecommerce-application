package com.example.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3419981709244901345L;

	private List<OrderProductDto> orderedProducts;
	private Double total;
	private CustomerDto customer;
	private OrderShippingDetails orderShippingDetails;

}
