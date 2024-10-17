package com.practice.graphql.Api;

import com.practice.graphql.entity.Product;
import com.practice.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @QueryMapping
    List<Product> getAllProduct() {
        return productService.getProductAll();
    }

    @QueryMapping
    List<Product> getProductByCategory(@Argument String category) {
        return productService.getProductByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int id, @Argument int stock) {
        return productService.updateProduct(id, stock);
        
    }
}
