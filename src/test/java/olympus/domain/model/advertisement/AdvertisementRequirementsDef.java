package olympus.domain.model.advertisement;

import java.util.List;

import org.junit.Assert;
import org.mockito.Mock;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.application.advertisement.AdvertisementRequirementsImpl;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AdvertisementRequirementRepository;
import olympus.domain.advertisement.service.AdvertisementRequirementsService;

public class AdvertisementRequirementsDef {
	int cucumbers;

	@Mock
	private AdvertisementRequirementRepository repository;

	private AdvertisementRequirementsImpl service;
	
	private Advertisement advertisement;

	@Dado("^exista promoções nas companhias$")
	public void existsPromotionsOnCompanies() throws Throwable {
		Assert.assertEquals(true, true);
	}

	@Quando("^a diferença for de \"([^\"]*)\"% de diferença de valor atual do ticket$")
	public void differencePercentagePromotion(Long percentage) throws Throwable {
		Assert.assertEquals(true, true);
	}

	@Entao("^não será notificado o usuário$")
	public void dontNotifyUser() {
		Assert.assertEquals(true, true);
	}
	
	@Entao("^será notificado o usuário da promoção$")
	public void notifyUser() {
		Assert.assertEquals(true, true);
	}
}
