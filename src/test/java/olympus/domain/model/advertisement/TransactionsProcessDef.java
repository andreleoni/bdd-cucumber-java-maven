package olympus.domain.model.advertisement;

import java.util.List;

import org.junit.Assert;
import org.mockito.Mock;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AdvertisementRequirementRepository;
import olympus.domain.advertisement.service.AdvertisementRequirementsService;

public class TransactionsProcessDef {
	int cucumbers;

	@Mock
	private AdvertisementRequirementRepository repository;

	private List<Advertisement> advertisement;

	private AdvertisementRequirementsService advertisementService;

	private Double resultantAmount;

	@Dado("^as seguintes transações$")
	public void setup() throws Throwable {
		Assert.assertEquals(true, true);
//		this.advertisementService = new AdvertisementRequirementsService(repository);
//		this.advertisement = advertisement;
	}

	@E("^conta (\\d+) e nome \"([^\"]*)\"$")
	public void account() {
		Assert.assertEquals(true, true);
//		this.advertisement = new Advertisement(account, name);
	}

	@Quando("^eu faço transações$")
	public void click() throws Throwable {
		Assert.assertEquals(true, true);
//		resultantAmount = this.transactionsService.getAmountAfterProcessTransactions(0.0, transactions, advertisement);
	}

	@Entao("^meu saldo deverá ser de (.+) reais$")
	public void assertThat() {
		Assert.assertEquals(true, true);
	}

}
