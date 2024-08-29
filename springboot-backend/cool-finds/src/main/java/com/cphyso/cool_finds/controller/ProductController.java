package com.cphyso.cool_finds.controller;

import com.cphyso.cool_finds.model.Product;
import com.cphyso.cool_finds.service.ProductService;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
		
		private ProductService productService;
		
		public ProductController(ProductService productService) {
				this.productService = productService;
		}
		
		@GetMapping(value = { "", "/" })
		public @NotNull Iterable<Product> getProducts() {
				return productService.getAllProducts();
		}
}