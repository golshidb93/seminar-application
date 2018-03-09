package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.CourseParticipant;
import no.seminar.seminarApplication.repositories.CourseParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseParticipantService {

    private final CourseParticipantRepository courseParticipantRepository;

    public CourseParticipantService(CourseParticipantRepository courseParticipantRepository) {
        this.courseParticipantRepository = courseParticipantRepository;
    }

    public void addCourseParticipant(CourseParticipant courseParticipant){
        courseParticipantRepository.save(courseParticipant);
    }

    public List<CourseParticipant> listAllCourseParticipants(){
        List<CourseParticipant> courseParticipants = new ArrayList<>();
        courseParticipantRepository.findAll().forEach(courseParticipants::add);
        return courseParticipants;
    }
}
