package no.seminar.seminarApplication.controllers;

import no.seminar.seminarApplication.entities.CourseParticipant;
import no.seminar.seminarApplication.services.CourseParticipantService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseParticipantController {

    private final CourseParticipantService courseParticipantService;

    public CourseParticipantController(CourseParticipantService courseParticipantService) {
        this.courseParticipantService = courseParticipantService;
    }

    @RequestMapping (method = RequestMethod.POST,value="/course/{id}/participants")
    public void addCourseParticipant(@RequestBody CourseParticipant courseParticipant){
        courseParticipantService.addCourseParticipant(courseParticipant);
    }

}
