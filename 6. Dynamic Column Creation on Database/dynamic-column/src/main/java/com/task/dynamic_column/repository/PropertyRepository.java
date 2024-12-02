package com.task.dynamic_column.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.dynamic_column.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
