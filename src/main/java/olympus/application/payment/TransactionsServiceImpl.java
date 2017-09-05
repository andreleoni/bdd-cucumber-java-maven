package olympus.application.payment;

import java.util.List;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AccountRepository;
import olympus.domain.transaction.Transaction;
import olympus.domain.transaction.TransactionsService;
import olympus.domain.transaction.repository.TransactionRepository;

public class TransactionsServiceImpl implements TransactionsService {

	private TransactionRepository repository;

	public TransactionsServiceImpl(TransactionRepository repository) {
		this.repository = repository;
	}

	@Override
	public void perform(Transaction transaction) {
		// TODO Auto-generated method stub

	}

	@Override
	public Double getAmountAfterProcessTransactions(Double startingAmount, List<Transaction> transactions,
			Advertisement advertisement) {
		Double totalAmount = startingAmount; 
		for (Transaction transaction : transactions) {
			totalAmount += transaction.getAmount();
		}
		return totalAmount;		
	}

}
