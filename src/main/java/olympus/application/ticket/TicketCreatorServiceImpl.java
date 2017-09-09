package olympus.application.ticket;

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
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Double getAmountAfterProcessTransactions(Double startingAmount, List<Transaction> transactions,
//			Advertisement advertisement) {
//		Double totalAmount = startingAmount; 
//		for (Transaction transaction : transactions) {
//			totalAmount += transaction.getAmount();
//		}
//		return totalAmount;		
//	}

}
