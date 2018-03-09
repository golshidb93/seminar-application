package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.Course;
import no.seminar.seminarApplication.entities.CourseInstructor;
import no.seminar.seminarApplication.entities.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    private ArrayList<Course> courses = new ArrayList<>(Arrays.asList(
            new Course("Java", new CourseInstructor("Arne Styve"),new Room("R324"), "08:00", "10:00"),
            new Course("Micro controllers",new CourseInstructor("Arne Styve"),new Room("L120"), "12:15", "14:00"),
            new Course("Python", new CourseInstructor("Arne Styve"),new Room("L120"), "16:00", "17:00")
        ));


    public List<Course> listAllCourses(){
         return this.courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
