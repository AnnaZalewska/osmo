package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Activities extends  EntityAbstract {

    String subject;

    List<Instructor> instructors;

    Cluster cluster;
}
