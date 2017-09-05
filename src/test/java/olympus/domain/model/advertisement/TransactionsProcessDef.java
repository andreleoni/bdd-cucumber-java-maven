package olympus.domain.model.advertisement;

import java.util.List;

import org.junit.Assert;
import org.mockito.Mock;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.application.payment.TransactionsServiceImpl;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.transaction.Transaction;
import olympus.domain.transaction.TransactionsService;
import olympus.domain.transaction.repository.TransactionRepository;

public class TransactionsProcessDef {
	int cucumbers;

	@Mock
	private TransactionRepository repository;

	private List<Transaction> transactions;

	private Advertisement advertisement;

	private TransactionsService transactionsService;

	private Double resultantAmount;

	@Dado("^as seguintes transações$")
	public void setup(List<Transaction> transactions) throws Throwable {
		this.transactionsService = new TransactionsServiceImpl(repository);
		this.transactions = transactions;
	}

	@E("^conta (\\d+) e nome \"([^\"]*)\"$")
	public void account(Long account, String name) {
		this.advertisement = new Advertisement(account, name);
	}

	@Quando("^eu faço transações$")
	public void click() throws Throwable {
		resultantAmount = this.transactionsService.getAmountAfterProcessTransactions(0.0, transactions, advertisement);
	}

	@Entao("^meu saldo deverá ser de (.+) reais$")
	public void assertThat(Double balance) {

		Assert.assertEquals(balance, resultantAmount);
	}

}
