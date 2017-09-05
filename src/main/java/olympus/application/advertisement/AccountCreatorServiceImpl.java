package olympus.application.advertisement;

import org.springframework.stereotype.Service;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.InvalidAccountDuplicatedName;
import olympus.domain.advertisement.InvalidAccountNameException;
import olympus.domain.advertisement.repository.AccountRepository;
import olympus.domain.advertisement.service.AccountCreatorService;

@Service
public class AccountCreatorServiceImpl implements AccountCreatorService {

	private AccountRepository repository;
	
	public AccountCreatorServiceImpl(AccountRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Advertisement create(Advertisement advertisement) {
		if (advertisement.getName() == null) {
			throw new InvalidAccountNameException("Nome em branco");
		} else if (advertisement.getName().length() > 20) {
			throw new InvalidAccountNameException("Limite de caracteres atingido para criação da treta"); 
		} else if (repository.findByName(advertisement.getName()) != null) {			 
			throw new InvalidAccountDuplicatedName("Nome de conta duplicado"); 		
		}			
		
		return repository.saveAndFlush(advertisement);
	}

}
