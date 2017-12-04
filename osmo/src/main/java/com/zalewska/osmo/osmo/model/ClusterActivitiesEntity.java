package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cluster_activities")
public class ClusterActivitiesEntity extends EntityAbstract {

//    @OneToMany(mappedBy = "cluster", cascade = CascadeType.ALL)
//    private ClusterEntity cluster;
//
//    @OneToMany(mappedBy = "activities", cascade = CascadeType.ALL)
//    private ActivitiesEntity activities;
}
