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

	private AccountCreatorServiceImpl service;

	@Mock
	private AccountRepository repository;

	private Advertisement advertisement;

	@Dado("^uma conta (\\d+) de nome \"([^\"]*)\"$")
	public void setup(Long number, String name) throws Throwable {
		this.advertisement = new Advertisement(number, name);

		MockitoAnnotations.initMocks(this);
		this.service = new AccountCreatorServiceImpl(repository);
	}

	@Quando("^eu clico em criar conta$")
	public void click() throws Throwable {
		this.service.create(advertisement);
	}

	@Entao("^uma conta de número (\\d+) com o nome \"([^\"]*)\" e com o saldo (\\d+) deve ter sido criada$")
	public void assertThat(Long number, String name, Double balance) {
		Mockito.verify(repository, VerificationModeFactory.only()).saveAndFlush(advertisement);
	}

}
