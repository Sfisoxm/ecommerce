package com.cphyso.cool_finds.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull(message = "Product name is required.")
		@Basic(optional = false)
		private String name;
		private Double price;
		private String pictureUrl;
		
		public Product(String name, Double price, String pictureUrl) {
				this.name = name;
				this.price = price;
				this.pictureUrl = pictureUrl;
		}
		
		public Long getId() {
				return id;
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
		
		public Double getPrice() {
				return price;
		}
		
		public void setPrice(Double price) {
				this.price = price;
		}
		
		public String getPictureUrl() {
				return pictureUrl;
		}
		
		public void setPictureUrl(String pictureUrl) {
				this.pictureUrl = pictureUrl;
		}
}