package olympus.domain.payment.service;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.InvalidAccountNameException;

public interface AccountCreatorService {

	public Advertisement create(Advertisement advertisement) throws InvalidAccountNameException;
}
