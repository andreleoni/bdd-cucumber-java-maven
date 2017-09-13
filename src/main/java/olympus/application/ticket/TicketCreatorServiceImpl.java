package olympus.application.ticket;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import olympus.domain.ticket.InvalidTicketException;
import olympus.domain.ticket.Ticket;
import olympus.domain.ticket.repository.TicketCreatorRepository;
import olympus.domain.ticket.service.TicketCreatorService;

public class TicketCreatorServiceImpl implements TicketCreatorService {

	private TicketCreatorRepository repository;

	public TicketCreatorServiceImpl(TicketCreatorRepository repository) {
		this.repository = repository;
	}

	@Override
	public Ticket create(Ticket ticket) throws InvalidTicketException {		
		String d = ticket.getDateDeparture();
		String r = ticket.getDateReturn();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dateDeparture = null;
		try {
			dateDeparture = new Date(format.parse(d).getTime());
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
		Date dateReturn = null;
		try {
			dateReturn = new Date(format.parse(r).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if (dateDeparture == null) {		
			throw new InvalidTicketException("Data de partida não pode ficar em branco");		
 		} else if (dateDeparture.after(dateReturn)) {		
 			throw new InvalidTicketException("Data de partida nao pode ser superior a data de retorno"); 		
 		}
		
	 	return repository.saveAndFlush(ticket);		
 	}
}
