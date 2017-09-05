package olympus.application.advertisement;

import org.springframework.stereotype.Service;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.AccountBalanceInformation;
import olympus.domain.advertisement.repository.AccountRepository;
import olympus.domain.advertisement.service.AccountBalanceService;

@Service
public class AccountBalanceServiceImpl implements AccountBalanceService {

	private AccountRepository repository;
	
	public AccountBalanceServiceImpl(AccountRepository repository) {
		this.repository = repository;
	}

	@Override
	public AccountBalanceInformation generateBalanceOf(Long accountNumber) {
		Advertisement advertisement = repository.getOne(accountNumber);
		
		//TODO: Transactions
		//TODO: Balance
		return null;
	}

}
