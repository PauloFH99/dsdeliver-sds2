package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

<<<<<<< HEAD
public interface ProductRepository  extends JpaRepository<Product, Long>{
	
	List<Product> findAllByOrderByNameAsc();

=======
public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findAllByOrderByNameAsc();
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
}
