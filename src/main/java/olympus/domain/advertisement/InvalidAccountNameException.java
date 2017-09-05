package olympus.domain.advertisement;

public class InvalidAccountNameException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidAccountNameException(String message) {
		super(message);			
	}
}
