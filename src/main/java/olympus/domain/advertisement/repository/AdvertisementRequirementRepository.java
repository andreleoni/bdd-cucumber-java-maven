package olympus.domain.advertisement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olympus.domain.advertisement.Advertisement;

@Repository
public interface AdvertisementRequirementRepository extends JpaRepository<Advertisement, Long> {
	
	public Advertisement findByAdvertisementId(Long advertisementId);

	public List<Advertisement> findAll();
}
