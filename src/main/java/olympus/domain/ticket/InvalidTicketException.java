package olympus.domain.ticket;

public class InvalidTicketException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidTicketException(String message) {
		super(message);			
	}
}
