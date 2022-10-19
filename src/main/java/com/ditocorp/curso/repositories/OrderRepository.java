package com.ditocorp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
