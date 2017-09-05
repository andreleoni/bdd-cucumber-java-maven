package olympus.interfaces.payment;

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

@RestController
@RequestMapping("/account")
public class AccountResource {

	private AccountBalanceService balanceService;
	private AccountCreatorService creatorService;

	@Autowired
	public AccountResource(AccountBalanceService balanceService, AccountCreatorService creatorService) {
		this.balanceService = balanceService;
		this.creatorService = creatorService;
	}

	@GetMapping
	@RequestMapping(method = RequestMethod.GET, path = "/{accountNumber}")
	public AccountBalanceInformation getBalanceBy(@PathVariable("accountNumber") Long accountNumber) {

		return null;
	}

	@PostMapping
	public AccountBalanceInformation insert(@RequestBody Advertisement advertisement) {
		
		return null;
	}
}
