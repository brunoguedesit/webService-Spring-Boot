package com.brunoguedes.webServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoguedes.webServiceSpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
