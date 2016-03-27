package models;

import java.util.Date;
import java.util.List;

import java.lang.StringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import models.ClimbPoint;

@Entity
public class Climb {

    @Id
    @GeneratedValue
    public Long climb_id;
    public Long route_id;
    public Long user_id;
    @Temporal(TemporalType.TIMESTAMP)
    public Date start_time;
    @Temporal(TemporalType.TIMESTAMP)
    public Date end_time;
    @Lob
    public String climb_points;

    public Climb() {
        this.route_id = -1L;
        this.user_id = -1L;
        this.start_time = new java.util.Date();
        this.end_time = new java.util.Date();
        this.climb_points = "null";
    }

    public Climb(Long route_id, Long user_id, Date start_time, Date end_time,
            List<ClimbPoint> climb_points) {
        this.route_id = route_id;
        this.user_id = user_id;
        this.start_time = start_time;
        this.end_time = end_time;

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (ClimbPoint cp: climb_points) {
            sb.append(cp.toString());
            sb.append(",");
        }
        sb.append("]");
        this.climb_points = sb.toString();
    }

}
