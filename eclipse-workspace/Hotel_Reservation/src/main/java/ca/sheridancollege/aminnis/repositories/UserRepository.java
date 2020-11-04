package ca.sheridancollege.aminnis.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
}
