package com.zalewska.osmo.osmo.customer.repo;


import java.util.List;

import com.zalewska.osmo.osmo.customer.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
	List<CustomerEntity> findByLastName(String lastName);
}
