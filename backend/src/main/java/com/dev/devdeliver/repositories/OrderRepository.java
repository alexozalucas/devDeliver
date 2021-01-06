package com.dev.devdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.devdeliver.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
