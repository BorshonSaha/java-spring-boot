package com.task.dynamic_column.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.dynamic_column.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
