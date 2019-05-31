package com.capgemini.Manage.service;

import java.util.List;

import com.capgemini.Manage.bean.Customer;

public interface ManageCustomerInterface {

	Customer createCustomer(Customer customer);

	Customer deleteCustomer(int customerId);

	List<Customer> listAllCustomer();

	Customer editCustomer(Customer customer);

}