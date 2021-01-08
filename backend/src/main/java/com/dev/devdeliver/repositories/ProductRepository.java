package com.dev.devdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.devdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
	List <Product> findAllByOrderByNameAsc();
	

}
