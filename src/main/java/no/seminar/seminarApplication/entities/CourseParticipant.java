package no.seminar.seminarApplication.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CourseParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "participant_id")
    private Long id;
    private String name;
    private String email;

    @JsonIgnore
    @ManyToMany(mappedBy = "courseParticipants")
    private List<Course> courses;

    public CourseParticipant(String name, String email) {
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public CourseParticipant() {
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
