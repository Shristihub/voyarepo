package com.productapp.model;

public class Product {
	private String productName;
	private String brand;
	private Integer productId;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String brand, Integer productId, double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.productId = productId;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", brand=" + brand + ", productId=" + productId + ", price="
				+ price + "]";
	}
	
}
