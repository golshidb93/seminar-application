package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.CourseInstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CourseInstructorService {

    private ArrayList<CourseInstructor> courseInstructors = new ArrayList<>(Arrays.asList(
            new CourseInstructor("Arne Styve"),
            new CourseInstructor("Vegard Lima")
    ));

    public void addCourseInstructor(CourseInstructor courseInstructor){
        courseInstructors.add(courseInstructor);
    }
}
