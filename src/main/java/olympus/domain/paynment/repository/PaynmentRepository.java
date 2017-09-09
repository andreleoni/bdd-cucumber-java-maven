package olympus.domain.paynment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olympus.domain.advertisement.Advertisement;
import olympus.domain.paynment.Paynment;

@Repository
public interface PaynmentRepository extends JpaRepository<Paynment, Long> {
	
	public Paynment findByPaymentId(Long paynmentId);

	public List<Paynment> findAll();
}
