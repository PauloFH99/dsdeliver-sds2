package com.devsuperior.dsdeliver.services;

import java.time.Instant;
<<<<<<< HEAD
import java.util.Iterator;
=======
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.devsuperior.dsdeliver.DTO.OrderDTO;
import com.devsuperior.dsdeliver.DTO.ProductDTO;
=======
import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.dto.ProductDTO;
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.OrderRepository;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {
<<<<<<< HEAD
	
	@Autowired
	private OrderRepository repository;
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list =repository.findOrderWithProducts();
		return list.stream()
				.map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	@Transactional
	public OrderDTO insert(OrderDTO dto){
		Order order = new Order(null,dto.getAddress(),dto.getLatitude(),dto.getLongitude(),
				Instant.now(),OrderStatus.PENDING);
		for (ProductDTO p: dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
						
=======

	@Autowired
	private OrderRepository repository;

	@Autowired
	private ProductRepository productrepository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdesWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public OrderDTO insert(OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(),
				OrderStatus.PENDING);
		for (ProductDTO p : dto.getProducts()) {
			Product product = productrepository.getOne(p.getId());
			order.getProducts().add(product);
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
		}
		order = repository.save(order);
		return new OrderDTO(order);
	}
<<<<<<< HEAD
	@Transactional
	public OrderDTO setDelivered(Long id){
=======
	
	@Transactional
	public OrderDTO setDelivered(long id) {
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
		Order order = repository.getOne(id);
		order.setStatus(OrderStatus.DELIVERED);
		order = repository.save(order);
		return new OrderDTO(order);
<<<<<<< HEAD
		
=======
>>>>>>> 066786d59a7e22cbb27ba35247dda033f9a2ca3f
	}
}
