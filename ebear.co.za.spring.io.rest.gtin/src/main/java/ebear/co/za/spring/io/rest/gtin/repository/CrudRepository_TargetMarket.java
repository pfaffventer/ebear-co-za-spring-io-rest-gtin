package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.TargetMarket;

public interface CrudRepository_TargetMarket extends CrudRepository<TargetMarket, Long> {

	List<TargetMarket> findById(@Param("id") long id);

	List<TargetMarket> findByTargetMarketCode(@Param("targetMarketCode") String targetMarketCode);
	
}