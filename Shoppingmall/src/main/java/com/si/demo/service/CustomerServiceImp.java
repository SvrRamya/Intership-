package com.si.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Customer;
import com.si.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	CustomerRepository c1;

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return c1.save(customer);
	}

	@Override
	public List<Customer> fetchCustomersList() {
		// TODO Auto-generated method stub
		return c1.findAll();
	}

	@Override
	public Customer fetchCustomerById(Long id) {
		// TODO Auto-generated method stub
		return c1.findById(id).get();
	}

	@Override
	public void deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		c1.deleteById(id);
	}

	@Override
	public Customer updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return c1.save(customer);
	}
}
