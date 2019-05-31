package com.capgemini.Manage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.Manage.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
	
	@Query(value = "select * from Customer where email =?1" , nativeQuery = true)
	Customer findByEmailAddress(String emailAddress);

}
