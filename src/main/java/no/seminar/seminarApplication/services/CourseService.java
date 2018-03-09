package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.Course;
import no.seminar.seminarApplication.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> listAllCourses(){
         //return this.courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }
}
