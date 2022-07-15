package com.cybage.pms.dao;

import java.util.List;

import com.cybage.pms.model.Product;

public interface ProductDao {
	
	public Product getProductById(int productId);
	
	public void addProduct(Product product);
	
	List<Product> getAllProduct();
	
	void deleteProduct(int productId);

}
