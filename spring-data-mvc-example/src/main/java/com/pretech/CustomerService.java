package com.pretech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class CustomerService {

	@Autowired
	private MongoTemplate customermongoTemplate;

	public void saveCustomer(Customer customer) {
		if (!customermongoTemplate.collectionExists(Customer.class)) {
			customermongoTemplate.createCollection(Customer.class);
		}
		customermongoTemplate.insert(customer, "customerTable");
	}

	public List<Customer> listCustomers() {
		return customermongoTemplate.findAll(Customer.class, "customerTable");
	}
}
