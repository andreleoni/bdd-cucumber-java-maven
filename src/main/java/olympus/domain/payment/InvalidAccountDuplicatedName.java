package olympus.domain.payment;


public class InvalidAccountDuplicatedName extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAccountDuplicatedName(String message) {
		super(message);			
	}
}