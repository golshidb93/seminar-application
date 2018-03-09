package no.seminar.seminarApplication.repositories;

import no.seminar.seminarApplication.entities.CourseParticipant;
import org.springframework.data.repository.CrudRepository;

public interface CourseParticipantRepository extends CrudRepository<CourseParticipant, Long>{
}
