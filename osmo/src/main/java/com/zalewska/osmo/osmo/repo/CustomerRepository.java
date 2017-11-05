package com.zalewska.osmo.osmo.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zalewska.osmo.osmo.model.Person;

public interface CustomerRepository extends CrudRepository<Person, Long> {
	List<Person> findByLastName(String lastName);
}
