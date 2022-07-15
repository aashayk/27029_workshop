package com.cybage.pms.service;

import java.util.List;

import com.cybage.pms.model.Product;

public interface ProductService {
	Product getProductById(int productId);
	void addProduct(Product product);
	List<Product> getAllProduct();
	void deleteProduct(int productId);
}
