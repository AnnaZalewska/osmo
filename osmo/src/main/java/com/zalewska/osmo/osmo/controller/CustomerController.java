package com.zalewska.osmo.osmo.controller;

import java.util.ArrayList;
import java.util.List;

import com.zalewska.osmo.osmo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zalewska.osmo.osmo.repo.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@GetMapping(value="/customer",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> getAll() {
		List<Person> list = new ArrayList<>();
		Iterable<Person> customers = repository.findAll();

		customers.forEach(list::add);
		return list;
	}
	
	@PostMapping(value="/postcustomer")
	public Person postCustomer(@RequestBody Person person) {

		repository.save(new Person(person.getFirstName(), person.getLastName()));
		return person;
	}

	@GetMapping(value="/findbylastname/{lastName}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findByLastName(@PathVariable String lastName) {

		List<Person> people = repository.findByLastName(lastName);
		return people;
	}
	
	@DeleteMapping(value="/customer/{id}")
	public void deleteCustomer(@PathVariable long id){
		Person person = new Person();
		String value = person != null ? "yest" : "no";
		repository.delete(id);
	}
}
