package com.capgemini.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.service.ManageCustomerInterface;
import com.capgemini.Manage.service.PofileInterface;

@RestController
public class ManageCustomerController
{	
	@Autowired
	ManageCustomerInterface manageCustomerInterface;
	PofileInterface profileInterface;
	
	@RequestMapping(value="/createCustomer",method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer)
	{
		customer=manageCustomerInterface.createCustomer(customer);
		return customer;

    }
	
	@RequestMapping(value="/editCustomer",method=RequestMethod.POST)
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		customer=manageCustomerInterface.editCustomer(customer);
		return customer;

    }
	
	@RequestMapping(value="/deleteCustomer",method=RequestMethod.DELETE)
	public Customer deleteCustomer(@RequestBody int customerId)
	{
		Customer customer=manageCustomerInterface.deleteCustomer(customerId);
		return customer;

    }
	
	@RequestMapping(value="/listAllCustomer",method=RequestMethod.GET)
	public List<Customer> listAllCustomer()
	{
		List<Customer> list = manageCustomerInterface.listAllCustomer();
		return list;

    }
	
	@RequestMapping(value="/viewProfile",method=RequestMethod.GET)
	public Customer viewProile(@RequestBody int customerId)
	{
		Customer customer=profileInterface.viewProfile(customerId);
		return customer;

    }
	
	@RequestMapping(value="/editProfile",method=RequestMethod.POST)
	public Customer editProfile(@RequestBody Customer customer)
	{
		customer=profileInterface.editProfile(customer);
		return customer;

    }

}