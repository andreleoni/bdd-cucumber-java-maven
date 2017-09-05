package olympus.domain.advertisement;

public class AccountBalanceInformation {

	private Advertisement advertisement;

	private Double balance;
	
	public AccountBalanceInformation(Advertisement advertisement, Double balance) {
		super();
		this.advertisement = advertisement;
		this.balance = balance;
	}

	public Advertisement getAccount() {
		return advertisement;
	}

	public void setAccount(Advertisement advertisement) {
		this.advertisement = advertisement;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
