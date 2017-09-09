package olympus.interfaces.paynment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.AccountBalanceInformation;
import olympus.domain.advertisement.service.AccountBalanceService;
import olympus.domain.advertisement.service.AccountCreatorService;
import olympus.domain.paynment.service.PaynmentBankSlipService;

@RestController
@RequestMapping("/payment")
public class PaynmentResource {

	private PaynmentBankSlipService paynmentBankSlipService;

	@Autowired
	public PaynmentResource(PaynmentBankSlipService paynmentBankSlipService) {
		this.paynmentBankSlipService = paynmentBankSlipService;
	}

	@GetMapping
	@RequestMapping(method = RequestMethod.GET, path = "/paynment")
	public PaynmentBankSlipService getBalanceBy() {

		return null;
	}

	@PostMapping
	public PaynmentBankSlipService insert() {
		
		return null;
	}
}
