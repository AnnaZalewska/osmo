package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "Cluster")
public class ClusterEntity extends EntityAbstract {

    @Column(name = "hour_start")
    private Date hourStart;

    @Column(name = "hour_stop")
    private Date hourStop;
}
