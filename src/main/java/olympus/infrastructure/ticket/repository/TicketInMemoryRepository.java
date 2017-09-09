package olympus.infrastructure.ticket.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.ticket.Ticket;

@Component
@Qualifier("inMemory")
public class TicketInMemoryRepository  {

	private Map<Long, Ticket> tickets;

	public Ticket getOne(Long userId) {
		return tickets.get(userId);
	}

	public Ticket saveAndFlush(Ticket ticket) {
		if (tickets == null) {
			tickets = new HashMap<>();
		}

		tickets.put(ticket.getTicketId(), ticket);
		
		return ticket;
	}

}
