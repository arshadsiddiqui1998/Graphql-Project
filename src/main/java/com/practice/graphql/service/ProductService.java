package com.practice.graphql.service;

import com.practice.graphql.entity.Product;
import com.practice.graphql.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductAll() {

        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(String category) {

        return productRepository.findByCategory(category);
    }

    public Product updateProduct(int id, int stock) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found" + id));
        product.setStock(stock);
        return productRepository.save(product);
    }

    public Product updateStockShipment(int id, int stockShipment) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found" + id));
        int oldStock = product.getStock();
        int newStock = stockShipment + oldStock;
        product.setStock(newStock);
        return productRepository.save(product);
    }
}
