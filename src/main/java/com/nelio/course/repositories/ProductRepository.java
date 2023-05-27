package com.nelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
