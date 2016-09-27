package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Commodity;

public interface CrudRepository_Commodity extends CrudRepository<Commodity, Long> {

	List<Commodity> findById(@Param("id") long id);

	List<Commodity> findByCommodityCode(@Param("commodityCode") String commodityCode);
	
}