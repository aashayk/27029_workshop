package com.cybage.pms;

import java.util.List;
import java.util.Scanner;

import com.cybage.pms.model.Product;
import com.cybage.pms.service.ProductService;
import com.cybage.pms.serviceImpl.ProductServiceImpl;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService productService;
		while(true)
		{
			System.out.println("Select 1.Add Product 2.Get All Product 3.Delete Product 4.exit");
			System.out.println("Enter Operation Number");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter Product ID:");
				int id=sc.nextInt();
				System.out.println("Enter Product Name:");
				String name=sc.next();
				System.out.println("Enter Product Price");
				double price=sc.nextDouble();
				Product product=new Product(id, name, price);
				productService=new ProductServiceImpl();
				productService.addProduct(product);
				
			break;
			
			case 2:
				productService=new ProductServiceImpl();
				List<Product> products=productService.getAllProduct();
				for(Product p:products)
				{
					System.out.println(p);
				}
			break;
			
			case 3:
				System.out.println("Enter Product Id to delete:");
				int id1=sc.nextInt();
				productService=new ProductServiceImpl();
				productService.deleteProduct(id1);
				
			break;
			
			case 4:
				System.exit(0);
			break;
			default: 
				System.out.println("Invalid Choice");
				break;
			}
			
		}
		
	}
}
