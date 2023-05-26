package com.nelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
}
