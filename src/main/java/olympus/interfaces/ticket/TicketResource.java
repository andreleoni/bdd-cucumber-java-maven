package olympus.interfaces.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.AccountBalanceInformation;
import olympus.domain.advertisement.service.AccountBalanceService;
import olympus.domain.advertisement.service.AccountCreatorService;
import olympus.domain.ticket.service.TicketCreatorService;

@RestController
@RequestMapping("/ticket")
public class TicketResource {

	private TicketCreatorService creatorService;

	@Autowired
	public TicketResource(TicketCreatorService creatorService) {
		this.creatorService = creatorService;
	}

	@GetMapping
	@RequestMapping(method = RequestMethod.POST, path = "/ticket")
	public TicketCreatorService create() {
		return null;
	}

	@PostMapping
	public TicketCreatorService insert() {
		return null;
	}
}
