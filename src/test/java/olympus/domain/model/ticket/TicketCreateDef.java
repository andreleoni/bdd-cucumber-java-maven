package olympus.domain.model.ticket;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.application.advertisement.AccountCreatorServiceImpl;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AccountRepository;

public class TicketCreateDef {
	int cucumbers;

	private TicketCreatorServiceImpl service;

	@Mock
	private TicketRepository repository;

	private Ticket ticket;

	@Dado("^informo data de chegada inferior a data de partida$")
	public void setup() throws Throwable {
//		this.advertisement = new Advertisement(number, name);
//
//		MockitoAnnotations.initMocks(this);
//		this.service = new AccountCreatorServiceImpl(repository);
	}

	@Quando("^clico em comprar passagem$")
	public void click() throws Throwable {
//		this.service.create(advertisement);
	}

	@Entao("^recebo mensagem de que a data é inválida  $")
	public void assertThat() {
//		Mockito.verify(repository, VerificationModeFactory.only()).saveAndFlush(advertisement);
	}

}
