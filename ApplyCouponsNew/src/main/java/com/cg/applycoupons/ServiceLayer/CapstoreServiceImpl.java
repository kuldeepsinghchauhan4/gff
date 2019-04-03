package com.cg.applycoupons.ServiceLayer;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.applycoupons.DAO.ICapstoreRepo;
import com.cg.applycoupons.bean.Coupon;
import com.cg.applycoupons.bean.Orders;
import com.cg.applycoupons.exceptions.EmptyProductList;
import com.cg.applycoupons.exceptions.InvalidProductId;

import ch.qos.logback.core.net.server.Client;

@Transactional
@Service("service")
public class CapstoreServiceImpl {
	@Autowired
	ICapstoreRepo repo;

	public ICapstoreRepo getRepo() {
		return repo;
	}

	public void setRepo(ICapstoreRepo repo) {
		this.repo = repo;
	}
	
	
	
	public Double applyCoupons(String couponCode,Double price) 
	{  
		return repo.applyCoupons(couponCode, price);

}

}