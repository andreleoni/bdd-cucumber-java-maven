package olympus.domain.advertisement.service;

import olympus.domain.advertisement.InvalidAdvertisementException;
import olympus.domain.ticket.Ticket;

public interface AdvertisementRequirementsService {
	
	public Ticket create(Ticket ticket) throws InvalidAdvertisementException;
}
