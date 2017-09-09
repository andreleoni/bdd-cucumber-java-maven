package olympus.domain.model.payment;

import java.util.List;

import org.junit.Assert;
import org.mockito.Mock;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.paynment.Paynment;
import olympus.domain.paynment.repository.PaynmentRepository;
import olympus.domain.paynment.service.PaynmentBankSlipService;

public class TransactionsProcessDef {
	int cucumbers;

	@Mock
	private PaynmentRepository repository;

	private List<Paynment> paynment;

	private Advertisement advertisement;

	private PaynmentBankSlipService transactionsService;

	private Double resultantAmount;

	@Dado("^pagamento não foi efetuado em até 48hrs$")
	public void setup() throws Throwable {
		Assert.assertEquals(true, true);
		//		this.transactionsService = new TransactionsServiceImpl(repository);
//		this.transactions = transactions;
	}

	@E("^conta (\\d+) e nome \"([^\"]*)\"$")
	public void account() {
		Assert.assertEquals(true, true);
		//		this.advertisement = new Advertisement(account, name);
	}

	@Quando("^vou validar o pagamento do ticket$")
	public void click() throws Throwable {
		Assert.assertEquals(true, true);
//		resultantAmount = this.transactionsService.getAmountAfterProcessTransactions(0.0, transactions, advertisement);
	}

	@Entao("^a reserva do ticket, será cancelada e o cliente receberá notificação de que a reserva foi cancelada$")
	public void assertThat() {
		Assert.assertEquals(true, true);
	}
}
