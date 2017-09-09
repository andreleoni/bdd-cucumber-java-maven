package olympus.domain.ticket.service;

import olympus.domain.advertisement.InvalidAccountNameException;
import olympus.domain.ticket.Ticket;

public interface TicketCreatorService {

	public Ticket create(Ticket ticket) throws InvalidAccountNameException;
}
