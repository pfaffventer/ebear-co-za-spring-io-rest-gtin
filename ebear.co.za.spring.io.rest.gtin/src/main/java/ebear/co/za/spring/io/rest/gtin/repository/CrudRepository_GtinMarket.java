package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.GtinMarket;

public interface CrudRepository_GtinMarket extends CrudRepository<GtinMarket, Long> {

	List<GtinMarket> findById(@Param("id") long id);

	List<GtinMarket> findByGtinCode(@Param("gtinCode") String gtinCode);

	List<GtinMarket> findByTargetMarketCode(@Param("targetMarketCode") String targetMarketCode);

}