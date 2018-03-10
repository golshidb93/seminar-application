package no.seminar.seminarApplication.repositories;

import no.seminar.seminarApplication.entities.CourseParticipant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseParticipantRepository extends CrudRepository<CourseParticipant, Long>{

    public List<CourseParticipant> findByName(String name);

    public List<CourseParticipant> findByCoursesName(String name);
}
