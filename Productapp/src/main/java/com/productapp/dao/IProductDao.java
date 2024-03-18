package com.productapp.dao;

import java.util.List;

import com.productapp.model.Product;

public interface IProductDao {
	void addProduct(Product product);
	List<Product> findAllProducts();
}
