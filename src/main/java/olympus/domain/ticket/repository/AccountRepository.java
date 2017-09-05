package olympus.domain.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olympus.domain.advertisement.Advertisement;

@Repository
public interface AccountRepository extends JpaRepository<Advertisement, Long> {
	
	public Advertisement findByName(String name);

	public List<Advertisement> findAll();
}
