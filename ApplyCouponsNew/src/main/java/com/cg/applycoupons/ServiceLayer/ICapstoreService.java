package com.cg.applycoupons.ServiceLayer;

import java.util.List;



import ch.qos.logback.core.net.server.Client;

public interface ICapstoreService {
	
	Double applyCoupons(String couponCode, Double price) ;
	
	
}
