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

@WebServlet("/EditProduct")
public class EditProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService productService = new ProductServiceImpl();
		String pid = request.getParameter("id");
		String name = request.getParameter("pname");
		String price = request.getParameter("pprice");
		int id;
		double pprice;
			id = Integer.parseInt(pid);
			pprice = Double.parseDouble(price);
			System.out.println(pid + " "+name+" " + price);

			Product product = new Product(id, name, pprice);
			productService.updateProduct(product);
			System.out.println("updated ....!!");
			response.sendRedirect("/AdvJavaWorkshop/ProductServlet");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
