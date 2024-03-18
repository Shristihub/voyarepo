package com.productapp.service;

import java.util.List;

import com.productapp.model.Product;

public interface IProductService {
	void addProduct(Product product);
	List<Product> getAllProducts();
}
