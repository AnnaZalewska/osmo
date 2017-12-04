package com.zalewska.osmo.osmo.customer;

import java.util.ArrayList;
import java.util.List;

import com.zalewska.osmo.osmo.customer.app.CustomerAsembler;
import com.zalewska.osmo.osmo.customer.model.CustomerEntity;
import com.zalewska.osmo.osmo.customer.model.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zalewska.osmo.osmo.customer.repo.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository repository;
	@Autowired
    CustomerAsembler asembler;

	@GetMapping(value="/customer",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> getAll() {
        List<Person> list = new ArrayList<>();
		Iterable<CustomerEntity> customers = repository.findAll();

		customers.forEach(c ->list.add(asembler.toDto(c)));
        return list;
	}
	
	@PostMapping(value="/postcustomer")
	public Person postCustomer(@RequestBody Person customer) {
        repository.save(asembler.toEntity(customer));
		return customer;
	}

	@GetMapping(value="/findbylastname/{lastName}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findByLastName(@PathVariable String lastName) {
        List<Person> list = new ArrayList<>();
		List<CustomerEntity> people = repository.findByLastName(lastName);
        people.forEach(c ->list.add(asembler.toDto(c)));
		return list;
	}
	
	@DeleteMapping(value="/customer/{id}")
	public void deleteCustomer(@PathVariable long id){
		repository.delete(id);
	}
}
