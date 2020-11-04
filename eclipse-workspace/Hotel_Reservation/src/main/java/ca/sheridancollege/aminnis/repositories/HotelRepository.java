package ca.sheridancollege.aminnis.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
	public List<Hotel> findByUsername(String username);
	@Transactional
	public String deleteByUsername(String username);
}
