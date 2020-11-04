package ca.sheridancollege.aminnis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByRolename(String rolename);
	
}
