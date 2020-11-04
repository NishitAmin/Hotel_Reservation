package ca.sheridancollege.aminnis.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

	public List<Room> findByUsername(String username);
}
