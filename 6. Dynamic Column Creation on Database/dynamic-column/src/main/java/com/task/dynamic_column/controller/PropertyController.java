package com.task.dynamic_column.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.task.dynamic_column.entity.Property;
import com.task.dynamic_column.service.PropertyService;

@Controller
public class PropertyController {
	@Autowired
    private PropertyService propertyService;

	@MutationMapping
    public Property addProperty(@Argument String title,@Argument String datatype,@Argument String category,@Argument Integer maxLength) {
        return propertyService.addProperty(title, datatype, category, maxLength);
    }
}
