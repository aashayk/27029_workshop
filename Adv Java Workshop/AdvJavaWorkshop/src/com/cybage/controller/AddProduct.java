package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Product;
import com.cybage.service.ProductService;
import com.cybage.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  ProductService productService  = new ProductServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("productId")!=null)
		{
			  int productid=Integer.parseInt(request.getParameter("productId"));
			  String pname=request.getParameter("productName");
			  System.out.println(pname);
			 int price= Integer.parseInt(request.getParameter("productPrice"));
			 Product product=new Product(productid,pname,price);
			 productService.addProduct(product);
			 System.out.println("product added succefully");
			 response.sendRedirect("/AdvJavaWorkshop/ProductServlet");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
