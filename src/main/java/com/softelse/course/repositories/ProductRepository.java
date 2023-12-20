package com.softelse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
