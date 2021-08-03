package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddressDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6459376545858387633L;

	private Long id;
	private String city;

}
