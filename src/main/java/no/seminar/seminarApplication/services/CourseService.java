package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.Course;
import no.seminar.seminarApplication.repositories.CourseInstructorRepository;
import no.seminar.seminarApplication.repositories.CourseRepository;
import no.seminar.seminarApplication.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseInstructorRepository courseInstructorRepository;
    private final RoomRepository roomRepository;

    public CourseService(CourseRepository courseRepository, CourseInstructorRepository courseInstructorRepository, RoomRepository roomRepository) {
        this.courseRepository = courseRepository;
        this.courseInstructorRepository = courseInstructorRepository;
        this.roomRepository = roomRepository;
    }

    public List<Course> listAllCourses(){
         //return this.courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }


    public Course addCourse(Course course) {
        roomRepository.save(course.getRoom());
        courseInstructorRepository.save(course.getCourseInstructor());
        return courseRepository.save(course);
    }


    public Course getCourseByName(String name) {
        return courseRepository.findByName(name);
    }
}
