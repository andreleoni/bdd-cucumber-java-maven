package olympus.domain.model.ticket;

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
import olympus.domain.ticket.Ticket;
import olympus.domain.ticket.repository.TicketCreatorRepository;

public class TicketCreateDef {
	int cucumbers;

	private TicketCreatorServiceImpl service;

	@Mock
	private TicketCreatorRepository repository;

	private Ticket ticket;

	@Dado("^informo data de chegada inferior a data de partida$")
	public void setup() throws Throwable {
		Assert.assertEquals(true, true);
		//		this.advertisement = new Advertisement(number, name);
//
//		MockitoAnnotations.initMocks(this);
//		this.service = new AccountCreatorServiceImpl(repository);
	}

	@Quando("^clico em comprar passagem$")
	public void click() throws Throwable {
		Assert.assertEquals(true, true);
//		this.service.create(advertisement);
	}

	@Entao("^recebo mensagem de que a data é inválida  $")
	public void assertThat() {
		Assert.assertEquals(true, true);
//		Mockito.verify(repository, VerificationModeFactory.only()).saveAndFlush(advertisement);
	}

}
