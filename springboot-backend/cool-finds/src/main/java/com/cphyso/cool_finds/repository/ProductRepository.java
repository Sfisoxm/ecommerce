package com.cphyso.cool_finds.repository;

import com.cphyso.cool_finds.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
