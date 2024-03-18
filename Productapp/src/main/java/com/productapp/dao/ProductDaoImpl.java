package com.productapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.productapp.model.Product;
import com.productapp.util.DbConnection;
import com.productapp.util.Queries;

public class ProductDaoImpl implements IProductDao {

	Connection connection;
	@Override
	public void addProduct(Product product) {
		connection  = DbConnection.openConnection();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(Queries.INSERTQUERY);
			ps.setString(1,product.getProductName());
			ps.setInt(2,product.getProductId());
			ps.setString(3,product.getBrand());
			ps.setDouble(4,product.getPrice());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DbConnection.closeConnection();
		}
		
		
	}

	@Override
	public List<Product> findAllProducts() {
		connection  = DbConnection.openConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Product> products = new ArrayList<>();
		try {
			ps = connection.prepareStatement(Queries.SELECTQUERY);
			rs = ps.executeQuery();
			while(rs.next()) {
				int productId = rs.getInt("productId");
				String productName = rs.getString("productName");
				String brand = rs.getString("brand");
				double price = rs.getDouble("price");
				Product product = new Product(productName, brand, productId, price);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DbConnection.closeConnection();
		}
		return products;
	}

}
