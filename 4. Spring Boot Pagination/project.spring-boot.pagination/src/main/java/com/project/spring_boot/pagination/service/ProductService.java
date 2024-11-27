package com.project.spring_boot.pagination.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project.spring_boot.pagination.entity.Product;
import com.project.spring_boot.pagination.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

//	to get all products
	public List<Product> findAllProducts() {
		return repository.findAll();
	}

//	get all products based on price, quantity, name
	public List<Product> findProductWithSorting(String field) {
		return repository.findAll(Sort.by(Sort.Direction.ASC, field));
	}

//	get products with pagination
	public Page<Product> findProductsWithPagination(int pageNumber, int pageSize) {
		Page<Product> products = repository.findAll(PageRequest.of(pageNumber, pageSize));
		return products;
	}
	
	public Page<Product> findProductsWithPaginationAndSorting(int pageNumber, int pageSize, String field) {
		Page<Product> products = repository.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(field)));
		return products;
	}
}
