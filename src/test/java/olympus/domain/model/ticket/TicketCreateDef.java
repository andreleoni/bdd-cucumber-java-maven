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
import olympus.domain.ticket.InvalidTicketException;
import olympus.domain.ticket.Ticket;
import olympus.domain.ticket.repository.TicketCreatorRepository;

public class TicketCreateDef {
	int cucumbers;

	private TicketCreatorServiceImpl service;
	
	private Ticket ticket;
	
	@Mock
	private TicketCreatorRepository repository;

	@Dado("^informo data de chegada \"([^\"]*)\" inferior a data de partida \"([^\"]*)\"$")
	public void setupInvalidDateReturn(String dateDeparture, String dateReturn) throws Throwable {
		this.ticket = new Ticket(null, dateDeparture, dateReturn);
		
		MockitoAnnotations.initMocks(this);
		this.service = new TicketCreatorServiceImpl(repository);
	}

	@Quando("^clico em comprar passagem$")
	public void click() throws Throwable {
		
	}

	@Entao("^recebo mensagem de que a data é inválida$")
	public void assertThat() {
		try {
			this.service.create(ticket);			
			Assert.fail();
		} catch (InvalidTicketException e) {
			Assert.assertEquals("Data de partida nao pode ser superior a data de retorno", e.getMessage());			
		}
	}
	
	@Dado("^o ticket foi cadastrado com data de partida \"([^\"]*)\" e data de retorno \"([^\"]*)\"$")
	public void ticketBought(String dateDeparture, String dateReturn) throws Throwable {
		this.ticket = new Ticket(null, dateDeparture, dateReturn);
		
		MockitoAnnotations.initMocks(this);
		this.service = new TicketCreatorServiceImpl(repository);
		
		try {
			this.service.create(ticket);
		} catch (InvalidTicketException e) {
			Assert.fail();
		}
	}
	
	@Quando("^ele gerar o boleto de pagamento$")
	public void generateBankSlip() throws Throwable {
		
	}
	
	@Entao("^reservo a passagem com a companhia aerea$")
	public void reserveTicket() throws Throwable {
		
	}
}

