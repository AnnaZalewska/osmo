package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Instructor")
public class InstructorEntity extends EntityAbstract {

//    @OneToMany(mappedBy = "activities", cascade = CascadeType.ALL)
//    private ActivitiesEntity activities;
}
