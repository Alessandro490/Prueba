package com.exchange.rodriguezvillalta.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.exchange.rodriguezvillalta.model.entities.Product;
import com.exchange.rodriguezvillalta.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public Product getProductById(Integer idProduct) {
		return productRepository.findById(idProduct).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"User not found with id :" + idProduct));
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Product product) {
		productRepository.findById(product.getId()).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"User not found with id :" + product.getId()));
		return productRepository.save(product);
	}
	
	public void deleteProduct(Integer idUser) {
		productRepository.deleteById(idUser);
	}

}
