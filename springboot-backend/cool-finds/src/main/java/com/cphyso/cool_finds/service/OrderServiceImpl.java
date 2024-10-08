package com.cphyso.cool_finds.service;


import com.cphyso.cool_finds.model.Order;
import com.cphyso.cool_finds.repository.OrderRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
		
		private OrderRepository orderRepository;
		
		public OrderServiceImpl(OrderRepository orderRepository) {
				this.orderRepository = orderRepository;
		}
		
		@Override
		public Iterable<Order> getAllOrders() {
				return this.orderRepository.findAll();
		}
		
		@Override
		public Order create(Order order) {
				order.setDateCreated(LocalDate.now());
				
				return this.orderRepository.save(order);
		}
		
		@Override
		public void update(Order order) {
				this.orderRepository.save(order);
		}
}