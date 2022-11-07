package com.ditocorp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
