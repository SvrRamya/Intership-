package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Customer;

public interface CustomerService {

	Customer save(Customer customer);

	List<Customer> fetchCustomersList();

	//Customer fetCustomerById(Long id);

	Customer fetchCustomerById(Long id);

	void deleteCustomerById(Long id);

	Customer updateCustomerDetails(Customer customer);

}
