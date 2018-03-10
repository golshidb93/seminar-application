package no.seminar.seminarApplication.repositories;

import no.seminar.seminarApplication.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>{

    public Course findByName(String name);
}
