package ca.sheridancollege.aminnis.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {

	public List<Payment> findByUsername(String username);
}
