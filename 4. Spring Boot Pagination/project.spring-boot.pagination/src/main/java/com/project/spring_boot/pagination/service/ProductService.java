package com.project.spring_boot.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.spring_boot.pagination.entity.Product;
import com.project.spring_boot.pagination.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAllProducts() {
		return repository.findAll();
	}
}
