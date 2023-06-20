package com.exchange.rodriguezvillalta.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exchange.rodriguezvillalta.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
