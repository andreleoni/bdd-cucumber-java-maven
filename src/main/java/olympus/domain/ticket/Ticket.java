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
	private Date dateDeparture;
	
	@Column
	private Date dateReturn;

	public Ticket() {}

	public Ticket(Long ticketId, Date dateDeparture, Date dateReturn) {
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

	public Date getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(Date dateDeparture) {
		this.dateDeparture = dateDeparture;
	}
	
	public Date getDateReturn() {
		return dateReturn;
	}
	
	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}
}
