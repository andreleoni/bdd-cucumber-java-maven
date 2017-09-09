package olympus.domain.ticket;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private Long ticketId;

	@Column
	private String dateDeparture;
	
	@Column
	private String dateReturn;

	public Ticket() {}

	public Ticket(Long ticketId, String dateDeparture, String dateReturn) {
		super();
		this.ticketId = ticketId;
		this.dateDeparture = dateDeparture;
		this.dateReturn = dateReturn;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTickertId(Long getTicketId) {
		this.ticketId = getTicketId;
	}

	public String getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(String dateDeparture) {
		this.dateDeparture = dateDeparture;
	}
	
	public String getDateReturn() {
		return dateReturn;
	}
	
	public void setDateReturn(String dateReturn) {
		this.dateReturn = dateReturn;
	}
}
