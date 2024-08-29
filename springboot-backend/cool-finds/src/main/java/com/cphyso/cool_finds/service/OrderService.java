package com.cphyso.cool_finds.service;

import com.cphyso.cool_finds.model.Order;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderService {
		
		@NotNull Iterable<Order> getAllOrders();
		
		Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);
		
		void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}