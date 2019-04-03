package com.cg.applycoupons.DAO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.applycoupons.ServiceLayer.ICapstoreService;
import com.cg.applycoupons.bean.Coupon;
import com.cg.applycoupons.bean.Orders;

import ch.qos.logback.core.net.server.Client;

@Transactional
@Repository("repo")
public class CapstoreRepoImpl implements   ICapstoreRepo {
	@PersistenceContext
	EntityManager entityManager;


 public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Autowired
	ICapstoreService couponservice;
	public ICapstoreService getCouponservice() {
		return couponservice;
	}


	public void setCouponservice(ICapstoreService couponservice) {
		this.couponservice = couponservice;
	}


	public Double applyCoupons(String couponCode, Double price) {
		
		double totalprice = 0;
		Coupon c1= new Coupon();
		String cou= c1.getCouponCode();
		Date enddate=c1.getExpiryDate();
		Orders o1= new Orders();
		
		double subo1=o1.getSubTotal();
		if(c1.isApplied()==false) {
			return subo1;
			
		}
		else
		{
			
		if(subo1>1000) 
		{
		double str=Double.parseDouble(c1.getDescription());
			 totalprice=subo1-((subo1*str)/100);
			
		}
		else if(subo1>5000) 
		{
		double str=Double.parseDouble(c1.getDescription());
			 totalprice=subo1-((subo1*str)/100);
			
		}
		else 
		{
		double str=Double.parseDouble(c1.getDescription());
			 totalprice=subo1-((subo1*str)/100);
			
		}
		return totalprice;
		
	}
	}
		
			
	
	
}
