package com.capg.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.capg.product.bean")
@ComponentScan("com.capg.product")
@ComponentScan("com.capg.product.controller")
@ComponentScan("com.capg.product.repo")
@ComponentScan("com.capg.product.service")
@ComponentScan("com.capg.product.exception")
@SpringBootApplication
public class ProductCard201941626KuldeepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCard201941626KuldeepApplication.class, args);
	}

}
