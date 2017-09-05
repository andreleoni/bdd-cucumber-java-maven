package olympus.domain.ticket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private Long number;

	@Column
	private String name;

	public Account() {}

	public Account(Long number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
