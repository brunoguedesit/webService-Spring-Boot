package com.brunoguedes.webServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoguedes.webServiceSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
