package com.task.dynamic_column.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.dynamic_column.entity.Test;

public interface TestRepository extends JpaRepository<Test, Long>{

}
