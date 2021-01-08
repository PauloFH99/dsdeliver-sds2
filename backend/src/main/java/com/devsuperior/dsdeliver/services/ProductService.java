package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.devsuperior.dsdeliver.DTO.ProductDTO;
=======
import com.devsuperior.dsdeliver.dto.ProductDTO;
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
<<<<<<< HEAD
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list =repository.findAllByOrderByNameAsc();
=======
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list  = repository.findAllByOrderByNameAsc();
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
