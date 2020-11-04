package ca.sheridancollege.aminnis.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	public List<Reservation> findByUsername(String username);
}
