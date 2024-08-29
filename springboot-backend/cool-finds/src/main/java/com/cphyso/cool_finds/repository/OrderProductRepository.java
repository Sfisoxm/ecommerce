package com.cphyso.cool_finds.repository;

import com.cphyso.cool_finds.model.OrderProduct;
import com.cphyso.cool_finds.model.OrderProductPK;

import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
