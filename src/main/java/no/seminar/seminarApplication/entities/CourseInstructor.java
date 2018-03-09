package no.seminar.seminarApplication.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseInstructor {

    @Id
    private long id;
    private String name;

    public CourseInstructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
