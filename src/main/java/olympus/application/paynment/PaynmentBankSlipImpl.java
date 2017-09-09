package olympus.application.paynment;

import java.util.List;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AdvertisementRequirementRepository;
import olympus.domain.paynment.InvalidPaynmentException;
import olympus.domain.paynment.Paynment;
import olympus.domain.paynment.repository.PaynmentRepository;
import olympus.domain.paynment.service.PaynmentBankSlipService;

public class PaynmentBankSlipImpl implements PaynmentBankSlipService {

	private PaynmentRepository repository;

	public PaynmentBankSlipImpl(PaynmentRepository repository) {
		this.repository = repository;
	}

	@Override
	public Paynment create(Paynment payment) throws InvalidPaynmentException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void perform(Paymnent transaction) {
//		// TODO Auto-generated method stub
//
//	}

//	@Override
//	public Double getAmountAfterProcessTransactions(Double startingAmount, List<Transaction> transactions,
//			Advertisement advertisement) {
//		Double totalAmount = startingAmount; 
//		for (Transaction transaction : transactions) {
//			totalAmount += transaction.getAmount();
//		}
//		return totalAmount;		
//	}

}
