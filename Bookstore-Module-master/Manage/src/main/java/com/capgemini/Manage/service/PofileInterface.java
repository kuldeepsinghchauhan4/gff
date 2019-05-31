package com.capgemini.Manage.service;

import com.capgemini.Manage.bean.Customer;

public interface PofileInterface {

	Customer viewProfile(int customerId);

	Customer editProfile(Customer customer);

}