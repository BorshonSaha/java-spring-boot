package com.project.spring_boot.pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring_boot.pagination.dto.ApiResponse;
import com.project.spring_boot.pagination.entity.Product;
import com.project.spring_boot.pagination.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ApiResponse<List<Product>> findAllProducts() {
		List<Product> allProducts =  service.findAllProducts();
		return new ApiResponse<>(allProducts.size(), allProducts);
	}
}