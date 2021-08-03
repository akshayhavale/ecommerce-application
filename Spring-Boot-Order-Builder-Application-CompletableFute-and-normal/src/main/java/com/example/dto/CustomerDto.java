package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5195830377712349465L;

	private Long id;

	private String firstName;

	private String lastName;

	private String phoneNumber;

	private AddressDto address;

}
