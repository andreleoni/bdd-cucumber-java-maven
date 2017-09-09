package olympus.domain.ticket.service;

import olympus.domain.ticket.InvalidTicketException;
import olympus.domain.ticket.Ticket;

public interface TicketCreatorService {

	public Ticket create(Ticket ticket) throws InvalidTicketException;
}
