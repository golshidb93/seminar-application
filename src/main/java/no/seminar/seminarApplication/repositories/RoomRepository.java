package no.seminar.seminarApplication.repositories;

import no.seminar.seminarApplication.entities.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
