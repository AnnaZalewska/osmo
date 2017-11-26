package com.zalewska.osmo.osmo.model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "customer")
public class CustomerEntity extends EntityAbstract {

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "invoice_data")
    private String invoiceData;

    @OneToMany(mappedBy = "activities", cascade = CascadeType.ALL)
    private List<ActivitiesEntity> activities;
}
