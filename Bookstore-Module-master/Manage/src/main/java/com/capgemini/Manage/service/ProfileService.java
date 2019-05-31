package com.capgemini.Manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.dao.CustomerRepository;

@Service
public class ProfileService implements PofileInterface {
	
	@Autowired
	CustomerRepository repository;
	
	
	@Override
	public Customer viewProfile(int customerId)
	{
		Customer customer = repository.getOne((Integer.toString(customerId)));
		return customer;
	}
	
	
	@Override
	public Customer editProfile(Customer customer)
	{
		Customer cust = repository.getOne(Integer.toString(customer.getCustomerId()));
		cust.setCustomerName(customer.getCustomerName());
		cust.setEmail(customer.getEmail());
		cust.setPassword(customer.getPassword());
		cust.setPhoneNumber(customer.getPhoneNumber());
		cust.setAddress(customer.getAddress());
		cust.setCity(customer.getCity());
		cust.setZipCode(customer.getZipCode());
		cust.setCountry(customer.getCountry());
		repository.save(cust);
		
		return cust;	
	}

}
