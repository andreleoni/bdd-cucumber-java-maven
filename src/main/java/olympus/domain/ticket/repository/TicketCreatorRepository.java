package olympus.domain.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.ticket.Ticket;

@Repository
public interface TicketCreatorRepository extends JpaRepository<Ticket, Long> {
	
	public Ticket findByTicketId(Long TicketId);

	public List<Ticket> findAll();
}
