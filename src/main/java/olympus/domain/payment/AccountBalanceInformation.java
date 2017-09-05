package olympus.domain.payment;

public class AccountBalanceInformation {

	private Account account;

	private Double balance;
	
	public AccountBalanceInformation(Account account, Double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
