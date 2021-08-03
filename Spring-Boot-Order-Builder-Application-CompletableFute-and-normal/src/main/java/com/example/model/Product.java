package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private Long id;

	@Column(name = "PRODUCT_NAME")
	private String name;

	@Column(name = "SKUCODE")
	private String skuCode;

	@Column(name = "QTY")
	private Integer quantity;

	@Column(name = "PRODUCT_PRICE")
	private Double price;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH,
			CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "SHOP_ID")
	private Shop shop;

	public Product(String productName, String skuCode, Integer qty, Double price, Shop shop) {
		this.name = productName;
		this.skuCode = skuCode;
		this.quantity = qty;
		this.price = price;
		this.shop = shop;
	}
}
