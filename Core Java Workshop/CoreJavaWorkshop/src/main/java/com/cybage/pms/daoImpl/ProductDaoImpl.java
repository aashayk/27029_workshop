package com.cybage.pms.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cybage.pms.dao.ProductDao;
import com.cybage.pms.model.Product;

import utility.JDBCUtility;

public class ProductDaoImpl implements ProductDao {
	
	Connection connection= JDBCUtility.getConnection();
	
	@Override
	public Product getProductById(int productId) {
		try {
			String sql="select * from product where id=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1,productId);
			ResultSet resultSet=ps.executeQuery();
			Product product = new Product(resultSet.getInt(1),resultSet.getString(2),resultSet.getDouble(3));
			
			return product;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return null;
	}

	@Override
	public void addProduct(Product product) {
		try {
			String sql="insert into product values(?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1,product.getProductId());
			ps.setString(2,product.getProductName());
			ps.setDouble(3,product.getProductPrice());
			ps.execute();
			System.out.println("Product Inserted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> products=new ArrayList<>();
		
		try {
			String sql="select * from product";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet=ps.executeQuery();
			while(resultSet.next()) {
				Product product = new Product (resultSet.getInt(1),resultSet.getString(2),resultSet.getDouble(3));
				products.add(product);
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		try {		
				String sql="delete from product where id=?";
				PreparedStatement ps=connection.prepareStatement(sql);
				ps.setInt(1,productId);
				ps.execute();
				System.out.println("Product Deleted Successfully");
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
