package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer_activities")
public class CustomerActivitiesEntity extends EntityAbstract {

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private CustomerEntity customer;
//
//    @OneToMany(mappedBy = "activities", cascade = CascadeType.ALL)
//    private ActivitiesEntity activities;
}
