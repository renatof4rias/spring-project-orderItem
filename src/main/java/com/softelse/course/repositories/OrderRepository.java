package com.softelse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

} 