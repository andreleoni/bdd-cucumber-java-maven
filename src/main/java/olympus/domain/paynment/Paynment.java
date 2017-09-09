package olympus.domain.paynment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paynment {

	@Id
	private Long paynmentId;

	@Column
	private String type;
	
	@Column
	private Long value;

	public Paynment() {}

	public Paynment(Long paynmentId, String type, Long value) {
		super();

		this.paynmentId = paynmentId;
		this.type = type;
		this.value = value;
	}

	public Long getPaynmentId() {
		return paynmentId;
	}

	public void setPaynmentId(Long paynmentId) {
		this.paynmentId = paynmentId;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
}
