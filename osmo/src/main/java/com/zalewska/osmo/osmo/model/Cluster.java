package com.zalewska.osmo.osmo.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Cluster extends EntityAbstract {

    Date hourStart;

    Date hourStop;
}
