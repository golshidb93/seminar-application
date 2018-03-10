package no.seminar.seminarApplication.controllers;

import no.seminar.seminarApplication.services.CourseParticipantService;
import no.seminar.seminarApplication.services.CourseService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseParticipantController {

    private final CourseParticipantService courseParticipantService;
    private final CourseService courseService;

    public CourseParticipantController(CourseParticipantService courseParticipantService, CourseService courseService) {
        this.courseParticipantService = courseParticipantService;
        this.courseService = courseService;
    }

}
