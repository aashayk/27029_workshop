package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;
import com.cybage.utility.JDBCUtility;

public class ProductDaoImpl implements ProductDao {
	public Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	@Override
	public Product getProductById(int productId) {
		String sql = "select * from product where id=?";
		try {
			connection = JDBCUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productId);
			resultSet = ps.executeQuery();
			return new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addProduct(Product product) {
		String sql = "insert into product values(?,?,?)";
		try {
			connection = JDBCUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getProductPrice());
			ps.execute();
			System.out.println("Product Inserted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> products = new ArrayList<>();
		try {
			connection = JDBCUtility.getConnection();
			String sql = "select * from product";
			PreparedStatement ps = connection.prepareStatement(sql);
			resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
				products.add(product);
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public void deleteProduct(int productId) {
		String sql = "delete from product where id=?";
		try {
			connection = JDBCUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productId);
			ps.execute();
			System.out.println("Product Deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateProduct(Product product) {
		String sql = "update product set name=?, price=? where id=?";
		try {
			connection = JDBCUtility.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,product.getProductName());
			preparedStatement.setDouble(2,product.getProductPrice());
			preparedStatement.setInt(3,product.getProductId());
			System.out.println(product);
			preparedStatement.executeUpdate();
			System.out.println("product updated succesfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
