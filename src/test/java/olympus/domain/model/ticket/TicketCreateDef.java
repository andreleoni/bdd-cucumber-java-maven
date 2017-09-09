package olympus.domain.model.ticket;

import java.util.List;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.application.ticket.TicketCreatorServiceImpl;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AdvertisementRequirementRepository;
import olympus.domain.ticket.InvalidTicketException;
import olympus.domain.ticket.Ticket;
import olympus.domain.ticket.repository.TicketCreatorRepository;
import olympus.domain.ticket.service.TicketCreatorService;

public class TicketCreateDef {
	int cucumbers;

	@Mock
	private TicketCreatorRepository repository;

	private TicketCreatorService ticketsService;
	
	private List<Ticket> tickets;
	
	private Ticket ticket;

	@Dado("^informo data de chegada inferior a data de partida$")
	public void setupInvalidDateReturn(List<Ticket> tickets) throws Throwable {
		this.ticketsService = new TicketCreatorServiceImpl(repository);
		this.tickets = tickets;
	}

	@Quando("^clico em comprar passagem$")
	public void click() throws Throwable {
//		this.ticket = new Ticket();
	}

	@Entao("^recebo mensagem de que a data é inválida$")
	public void assertThat() {
		try {
			Mockito.verify(repository, VerificationModeFactory.only()).saveAndFlush(ticket);
		} catch (InvalidTicketException e) {
			Assert.assertEquals("Data de partida nao pode ser superior a data de retorno", e.getMessage());
		}
	}

}
