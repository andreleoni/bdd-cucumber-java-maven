package olympus.domain.paynment.service;

import olympus.domain.paynment.InvalidPaynmentException;
import olympus.domain.paynment.Paynment;

public interface PaynmentBankSlipService {

	public Paynment create(Paynment payment) throws InvalidPaynmentException;
}
