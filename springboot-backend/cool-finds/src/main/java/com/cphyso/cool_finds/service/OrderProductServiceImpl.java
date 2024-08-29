package com.cphyso.cool_finds.service;

import com.cphyso.cool_finds.model.OrderProduct;
import com.cphyso.cool_finds.repository.OrderProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {
		
		private OrderProductRepository orderProductRepository;
		
		public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
				this.orderProductRepository = orderProductRepository;
		}
		
		@Override
		public OrderProduct create(OrderProduct orderProduct) {
				return this.orderProductRepository.save(orderProduct);
		}
}