package olympus.interfaces.advertisement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.service.AdvertisementRequirementsService;

@RestController
@RequestMapping("/advertisement")
public class AdvertisementResource {

	private AdvertisementRequirementsService advertisementRequirementsService;

	@Autowired
	public AdvertisementResource(AdvertisementRequirementsService advertisementRequirementsService) {
		this.advertisementRequirementsService = advertisementRequirementsService;
	}

	@GetMapping
	@RequestMapping(method = RequestMethod.GET, path = "/advertisement")
	public AdvertisementRequirementsService getBalanceBy() {

		return null;
	}

	@PostMapping
	public AdvertisementRequirementsService insert(@RequestBody Advertisement advertisement) {
		
		return null;
	}
}
