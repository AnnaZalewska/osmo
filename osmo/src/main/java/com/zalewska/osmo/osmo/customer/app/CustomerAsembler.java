package com.zalewska.osmo.osmo.customer.app;

import com.zalewska.osmo.osmo.customer.model.CustomerEntity;
import com.zalewska.osmo.osmo.customer.model.dto.Person;
import org.springframework.stereotype.Service;

@Service
public class CustomerAsembler {

    public CustomerEntity toEntity(Person dto) {
        CustomerEntity customer = new CustomerEntity();
        customer.setId(dto.getId());
        customer.setFirstName(dto.getFirstName());
        customer.setLastName(dto.getLastName());
        customer.setInvoiceData(dto.getInvoiceData());
        return customer;
    }

    public Person toDto(CustomerEntity entity) {
        Person dto = new Person();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setInvoiceData(entity.getInvoiceData());
        return dto;
    }
}
