package olympus.domain.advertisement;


public class InvalidAdvertisementException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAdvertisementException(String message) {
		super(message);			
	}
}
