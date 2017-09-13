package olympus.domain.model.payment;

import java.util.List;

import org.junit.Assert;
import org.mockito.Mock;

import cucumber.api.java.en.Given;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import olympus.application.paynment.PaynmentBankSlipImpl;
import olympus.application.ticket.TicketCreatorServiceImpl;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.paynment.Paynment;
import olympus.domain.paynment.repository.PaynmentRepository;
import olympus.domain.paynment.service.PaynmentBankSlipService;
import olympus.domain.ticket.Ticket;
import olympus.domain.ticket.repository.TicketCreatorRepository;

public class PaynmentBankSlipDef {
	int cucumbers;

	private PaynmentBankSlipImpl service;
	
	private Paynment ticket;
		
	@Mock
	private PaynmentRepository repository;

	@Dado("^pagamento não foi efetuado em até 48hrs$")
	public void paymentNotCompleted() throws Throwable {
		Assert.assertEquals(true, true);

	}

	@Quando("^vou validar o pagamento do ticket$")
	public void validateTicketPaynment() throws Throwable {
		Assert.assertEquals(true, true);
	}

	@Entao("^a reserva do ticket, será cancelada e o cliente receberá notificação de que a reserva foi cancelada$")
	public void cancelTicketReserve() {
		Assert.assertEquals(true, true);
	}
	
	@Dado("^pagamento foi efetuado$")
	public void paynmentDoesEffected() throws Throwable {
		
	}
	
	@Entao("^a reserva do ticket será efetuada e o cliente receberá notificação com o cartão de embarque$")
	public void theReserveWillBeCompletedAndSendNotification() throws Throwable {

	}
}
