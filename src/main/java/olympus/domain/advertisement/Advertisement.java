package olympus.domain.advertisement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Advertisement {

	@Id
	private Long advertisementId;

	@Column
	private Long discount;

	public Advertisement() {}

	public Advertisement(Long advertisementId, Long discount) {
		super();
		this.advertisementId = advertisementId;
		this.discount = discount;
	}

	public Long getAdvertisementId() {
		return advertisementId;
	}

	public void setAdvertisementId(Long advertisementId) {
		this.advertisementId = advertisementId;
	}

	public Long getDiscount() {
		return discount;
	}

	public void setDiscount(Long discount) {
		this.discount = discount;
	}

}
