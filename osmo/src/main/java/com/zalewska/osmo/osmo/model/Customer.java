package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
public class Customer extends Person {

    String invoiceData;

    List<Activities> activities;
}
