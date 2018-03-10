package no.seminar.seminarApplication.repositories;

import no.seminar.seminarApplication.entities.CourseInstructor;
import org.springframework.data.repository.CrudRepository;

public interface CourseInstructorRepository extends CrudRepository<CourseInstructor, Long> {
}
