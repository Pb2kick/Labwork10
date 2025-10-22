package com.appdev.crc.ranisg4.service;

import java.util.List;

import com.appdev.crc.ranisg4.entity.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProduct(Long id);
}