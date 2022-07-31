package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.dao.ProductDaoImpl;
import com.cybage.model.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao=new ProductDaoImpl();
	@Override
	public Product getProductById(int productId){
			return dao.getProductById(productId);
	}

	@Override
	public void addProduct(Product product){
			dao.addProduct(product);
	}

	@Override
	public List<Product> getAllProduct(){
			return dao.getAllProduct();
	}

	@Override
	public void deleteProduct(int productId){
			dao.deleteProduct(productId);
	}


	@Override
	public void updateProduct(Product product) {
			dao.updateProduct(product);		
	}

}
