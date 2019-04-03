package com.cg.applycoupons.DAO;

import java.util.List;

import ch.qos.logback.core.net.server.Client;

public interface ICapstoreRepo {

	
	Double applyCoupons(String couponCode, Double price) ;
}
