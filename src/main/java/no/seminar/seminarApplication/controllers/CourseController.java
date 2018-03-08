package no.seminar.seminarApplication.controllers;

import no.seminar.seminarApplication.entities.Course;
import no.seminar.seminarApplication.services.CourseService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @RequestMapping ("/courses")
    public List<Course> listAllCourses(){
        return courseService.listAllCourses();
    }

    @RequestMapping (method = RequestMethod.POST,value="/courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

}
