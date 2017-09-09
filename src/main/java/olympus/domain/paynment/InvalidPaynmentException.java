package olympus.domain.paynment;

public class InvalidPaynmentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidPaynmentException(String message) {
		super(message);			
	}
}
