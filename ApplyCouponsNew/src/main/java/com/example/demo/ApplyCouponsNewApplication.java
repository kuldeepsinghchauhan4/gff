package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.applycoupons")

@EntityScan("com.cg.applycoupons.bean")


public class ApplyCouponsNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplyCouponsNewApplication.class, args);
	}

}
