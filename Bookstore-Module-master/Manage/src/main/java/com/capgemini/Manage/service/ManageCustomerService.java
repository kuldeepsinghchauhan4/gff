package com.capgemini.Manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.dao.CustomerRepository;
import com.capgemini.Manage.exception.CustomerAlreadyExistsException;
import com.capgemini.Manage.exception.CustomerNotExistsException;
import com.capgemini.Manage.exception.emptyListException;

@Service
public class ManageCustomerService implements ManageCustomerInterface {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer createCustomer(Customer customer)
	{
		try 
		{
			Customer cust = customerRepository.findByEmailAddress(customer.getEmail());
		    if(cust != null)
		    {
			    throw new CustomerAlreadyExistsException("Customer already existing");
		    }
		    
		    customerRepository.save(customer);
		}
		catch(CustomerAlreadyExistsException eception)
		{
			
		}
		
		return customer;
	
	}
	
	
	@Override
	public Customer deleteCustomer(int customerId)
	{
		Customer customer = customerRepository.getOne((Integer.toString(customerId)));
		
		try  
		{
		    if(customer == null)
		    {
			    throw new CustomerNotExistsException("Customer not exist");
		    }
		    else
		    {
		    	customerRepository.delete(customer);
		    }
	    }
		catch(CustomerNotExistsException exception)
		{
			
		}
		
		return customer;
	}
	
	
	@Override
	public List<Customer> listAllCustomer()
	{
		List<Customer> list = customerRepository.findAll();
		
		try
		{
			
		    if(list == null)
		    {
			    throw new emptyListException("List is Empty");
		    }
		    
		}
		catch(emptyListException exception)
		{
			
		}
		return list;
	}
	
	
	@Override
	public Customer editCustomer(Customer customer)
	{
		Customer cust = customerRepository.getOne(Integer.toString(customer.getCustomerId()));
		cust.setCustomerName(customer.getCustomerName());
		cust.setEmail(customer.getEmail());
		cust.setPassword(customer.getPassword());
		cust.setPhoneNumber(customer.getPhoneNumber());
		cust.setAddress(customer.getAddress());
		cust.setCity(customer.getCity());
		cust.setZipCode(customer.getZipCode());
		cust.setCountry(customer.getCountry());
		customerRepository.save(cust);
		
		return cust;
		
	}

}


//2016309