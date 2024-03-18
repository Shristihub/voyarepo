package com.productapp.service;

import java.util.List;

import com.productapp.dao.IProductDao;
import com.productapp.dao.ProductDaoImpl;
import com.productapp.model.Product;

public class ProductServiceImpl implements IProductService {

	private IProductDao productDao = new ProductDaoImpl();
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.findAllProducts();
	}

}
