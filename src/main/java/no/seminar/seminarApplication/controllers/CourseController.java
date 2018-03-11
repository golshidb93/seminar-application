package no.seminar.seminarApplication.controllers;

import no.seminar.seminarApplication.entities.Course;
import no.seminar.seminarApplication.entities.CourseParticipant;
import no.seminar.seminarApplication.services.CourseParticipantService;
import no.seminar.seminarApplication.services.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;
    private final CourseParticipantService courseParticipantService;


    public CourseController(CourseService courseService, CourseParticipantService courseParticipantService) {
        this.courseService = courseService;
        this.courseParticipantService = courseParticipantService;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/course/{name}/participant")
    public Course addCourseParticipant(@RequestBody CourseParticipant courseParticipant, @PathVariable String name) {
        CourseParticipant savedCourseParticipant = courseParticipantService.addCourseParticipant(courseParticipant);//if it exists;

        Course courseByName = courseService.getCourseByName(name);

        courseByName.addCourseParticipant(savedCourseParticipant);
        return courseService.addCourse(courseByName);
    }


    @RequestMapping("/course/{name}/participants")
    public List<CourseParticipant> listAllCourseParticipants(@PathVariable String name) {
        return courseParticipantService.listAllCourseParticipants(name);
    }

    // Return a Course object because in the frontend it will be more convinient.
    @RequestMapping (method = RequestMethod.POST,value="/courses")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @RequestMapping("/course/{name}")
    public Course getCourse(@PathVariable String name) {
        return courseService.getCourseByName(name);
    }

    @RequestMapping("/courses")
    public List<Course> listAllCourses() {
        return courseService.listAllCourses();
    }

}
