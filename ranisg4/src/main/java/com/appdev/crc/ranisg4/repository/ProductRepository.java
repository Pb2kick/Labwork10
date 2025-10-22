package com.appdev.crc.ranisg4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.crc.ranisg4.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}