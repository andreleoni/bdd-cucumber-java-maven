package olympus.application.advertisement;

import org.springframework.stereotype.Service;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.InvalidAdvertisementException;
import olympus.domain.advertisement.repository.AdvertisementRequirementRepository;
import olympus.domain.advertisement.service.AdvertisementRequirementsService;
import olympus.domain.ticket.Ticket;

@Service
public class AdvertisementRequirementsImpl implements AdvertisementRequirementsService {

	private AdvertisementRequirementRepository repository;
	
	public AdvertisementRequirementsImpl(AdvertisementRequirementRepository repository) {
		this.repository = repository;
	}

	@Override
	public Ticket create(Ticket ticket) throws InvalidAdvertisementException {
		// TODO Auto-generated method stub
		return null;
	}

}
