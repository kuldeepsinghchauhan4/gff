package com.cg.applycoupons.springController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.applycoupons.DAO.ICapstoreRepo;

@RestController
public class ApplyCouponsController {

	@Autowired
	ICapstoreRepo repo;

	
	 


	@RequestMapping(value = "/applycoupons", method = RequestMethod.POST)
	public Double applyCoupon(String couponCode, Double price)  {

		return repo.applyCoupons(couponCode, price);

	}

	
	

}