package olympus.domain.ticket;

public class AccountBalanceInformation {

	private Ticket ticket;

	private Double balance;
	
	public AccountBalanceInformation(Ticket ticket, Double balance) {
		super();
		this.ticket = ticket;
		this.balance = balance;
	}

	public Ticket getAccount() {
		return ticket;
	}

	public void setAccount(Ticket ticket) {
		this.ticket = ticket;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
