package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.CourseParticipant;
import no.seminar.seminarApplication.repositories.CourseParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseParticipantService {

    private final CourseParticipantRepository courseParticipantRepository;

    public CourseParticipantService(CourseParticipantRepository courseParticipantRepository) {
        this.courseParticipantRepository = courseParticipantRepository;
    }

    public CourseParticipant addCourseParticipant(CourseParticipant courseParticipant) {
        return courseParticipantRepository.save(courseParticipant);
    }

    public List<CourseParticipant> listAllCourseParticipants(String name) {
        return courseParticipantRepository.findByCoursesName(name);
    }

}

