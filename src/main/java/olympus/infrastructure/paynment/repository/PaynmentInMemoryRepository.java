package olympus.infrastructure.paynment.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.paynment.Paynment;

@Component
@Qualifier("inMemory")
public class PaynmentInMemoryRepository  {

	private Map<Long, Paynment> payments;

	public Paynment getOne(Long userId) {
		return payments.get(userId);
	}

	public Paynment saveAndFlush(Paynment paynment) {
		if (payments == null) {
			payments = new HashMap<>();
		}

		payments.put(paynment.getPaynmentId(), paynment);
		return paynment;
	}

}
