package com.zalewska.osmo.osmo.customer.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private long id;

	private String firstName;

	private String lastName;

	private String invoiceData;

	@Override
	public String toString() {
		return String.format("Person[id=%d, firstName='%s', lastName='%s']", getId(), getFirstName(), getLastName());
	}
}
