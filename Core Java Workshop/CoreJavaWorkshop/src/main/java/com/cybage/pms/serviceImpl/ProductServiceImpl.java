package com.cybage.pms.serviceImpl;

import java.util.List;

import com.cybage.pms.dao.ProductDao;
import com.cybage.pms.daoImpl.ProductDaoImpl;
import com.cybage.pms.model.Product;
import com.cybage.pms.service.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao=new ProductDaoImpl();
	@Override
	public Product getProductById(int productId) {
		
		return dao.getProductById(productId);
	}

	@Override
	public void addProduct(Product product) {
		dao.addProduct(product);

	}

	@Override
	public List<Product> getAllProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public void deleteProduct(int productId) {
		dao.deleteProduct(productId);

	}

}
