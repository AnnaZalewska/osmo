package com.zalewska.osmo.osmo.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zalewska.osmo.osmo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
