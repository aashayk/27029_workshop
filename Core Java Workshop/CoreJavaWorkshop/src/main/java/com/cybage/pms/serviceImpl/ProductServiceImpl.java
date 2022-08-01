package com.cybage.pms.serviceImpl;

import java.util.List;

import com.cybage.pms.dao.ProductDao;
import com.cybage.pms.daoImpl.ProductDaoImpl;
import com.cybage.pms.model.Product;
import com.cybage.pms.service.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao=new ProductDaoImpl();
	public Product getProductById(int productId) {
		
		return dao.getProductById(productId);
	}

	public void addProduct(Product product) {
		dao.addProduct(product);

	}

	public List<Product> getAllProduct() {
		
		return dao.getAllProduct();
	}

	public void deleteProduct(int productId) {
		dao.deleteProduct(productId);

	}

}
