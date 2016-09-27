package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Variety;

public interface CrudRepository_Variety extends CrudRepository<Variety, Long> {

	List<Variety> findById(@Param("id") long id);

	List<Variety> findByCommodityCode(@Param("commodityCode") String commodityCode);

}