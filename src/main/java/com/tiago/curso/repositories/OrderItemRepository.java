package com.tiago.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
