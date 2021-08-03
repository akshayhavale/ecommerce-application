package com.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SHOP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SHOP_ID")
	private Long id;

	@Column(name = "SHOP_NAME")
	private String shopName;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PICKUP_ADDRESS_ID")
	private PickUpAddress pickUpAddress;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "shop")
	private Set<Product> product = new HashSet<>();

	public Shop(String shopName, String phoneNumber, PickUpAddress pickUpAddress) {
		this.shopName = shopName;
		this.phoneNumber = phoneNumber;
		this.pickUpAddress = pickUpAddress;
	}
}
