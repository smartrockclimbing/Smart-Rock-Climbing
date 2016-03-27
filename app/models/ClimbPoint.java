package models;

import java.util.Date;

import java.lang.StringBuilder;

public class ClimbPoint {
    public Long id;
    public Double x;
    public Double y;
    public Double z;
    Date time;

    public ClimbPoint() {
        this.id = -1L;
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.time = new Date();
    }

    public ClimbPoint(Long id, Double x, Double y, Double z, Date time) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.time = time;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        sb.append("\"climb_point_id\": " + this.id + ",");
        sb.append("\"x\": " + this.x + ",");
        sb.append("\"y\": " + this.y + ",");
        sb.append("\"z\": " + this.z + ",");
        sb.append("\"t\": " + this.time);

        sb.append("}");

        return sb.toString();
    }
}