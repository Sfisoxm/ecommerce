package com.cphyso.cool_finds.repository;


import com.cphyso.cool_finds.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}