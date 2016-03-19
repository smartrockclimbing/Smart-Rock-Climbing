package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Climb {

    @Id
    @GeneratedValue
    public Long id;
    public String name;

    public Climb() {

    }

    public Climb(String name) {
        this.name = name;
    }

}
