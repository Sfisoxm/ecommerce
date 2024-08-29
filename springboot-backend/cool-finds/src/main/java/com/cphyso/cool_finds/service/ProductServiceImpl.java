package com.cphyso.cool_finds.service;

import com.cphyso.cool_finds.exception.ResourceNotFoundException;
import com.cphyso.cool_finds.model.Product;
import com.cphyso.cool_finds.repository.ProductRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
		
		ProductRepository productRepository;
		
		public ProductServiceImpl(ProductRepository productRepository) {
				this.productRepository = productRepository;
		}

		@Override
		public Iterable<Product> getAllProducts() {
				return productRepository.findAll();
		}
		
		@Override
		public Product getProduct(long id) {
				return productRepository
							   .findById(id)
							   .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
		}
		
		@Override
		public Product save(Product product) {
				return productRepository.save(product);
		}
}