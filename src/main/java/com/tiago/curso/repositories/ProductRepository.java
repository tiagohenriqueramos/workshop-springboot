package com.tiago.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
