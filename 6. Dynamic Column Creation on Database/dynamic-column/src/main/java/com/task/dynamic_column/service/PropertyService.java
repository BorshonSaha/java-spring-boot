package com.task.dynamic_column.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.task.dynamic_column.entity.Product;
import com.task.dynamic_column.entity.Property;
import com.task.dynamic_column.repository.ProductRepository;
import com.task.dynamic_column.repository.PropertyRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class PropertyService {
	@Autowired
    private final PropertyRepository propertyRepository;
    @Autowired
    private final ProductRepository productRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public PropertyService(PropertyRepository propertyRepository, ProductRepository productRepository) {
        this.propertyRepository = propertyRepository;
        this.productRepository = productRepository;
    }

    @Transactional
    public Property addProperty(String title, String datatype, String category, Integer maxLength) {
    	
        // Save property to the database
        Property property = new Property();
        property.setTitle(title);
        Property savedProperty = propertyRepository.save(property);

        // Dynamically add a column to the Product table
        String columnName = "col_" + title.toLowerCase() + "_" + savedProperty.getId();
        
        // Handling data types
        String dataTypeWithConstraints;
        if (datatype.equalsIgnoreCase("VARCHAR") || datatype.equalsIgnoreCase("CHAR")) {
            // For VARCHAR and CHAR, include size constraint
            dataTypeWithConstraints = String.format("%s(%d)", datatype, maxLength != null ? maxLength : 255);
        } else if (datatype.equalsIgnoreCase("TEXT") || datatype.equalsIgnoreCase("DATE") || datatype.equalsIgnoreCase("BLOB")) {
            // For types like TEXT, DATE, and BLOB, no size constraint is applied
            dataTypeWithConstraints = datatype;
        } else {
            // For numeric types like INT, FLOAT, DOUBLE, etc., no size constraint is applied
            dataTypeWithConstraints = datatype;
        }

        // SQL query for creating new column
        String alterTableQuery = String.format(
            "ALTER TABLE product ADD COLUMN %s %s",
            columnName, dataTypeWithConstraints
        );

        try {
            entityManager.createNativeQuery(alterTableQuery).executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Error adding column to product table: " + e.getMessage(), e);
        }

        // Add a new product with the specified category
        Product product = new Product();
        product.setCategory(category);
        productRepository.save(product);

        return savedProperty;
    }
}
