package com.tiago.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
