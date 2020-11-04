package ca.sheridancollege.aminnis.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.aminnis.beans.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {

	public List<Receipt> findByUsername(String username);
}
