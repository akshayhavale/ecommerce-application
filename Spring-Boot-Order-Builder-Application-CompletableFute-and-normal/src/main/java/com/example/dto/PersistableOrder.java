package com.example.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PersistableOrder implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = -3949443290491106250L;

	private List<Long> products;

}
