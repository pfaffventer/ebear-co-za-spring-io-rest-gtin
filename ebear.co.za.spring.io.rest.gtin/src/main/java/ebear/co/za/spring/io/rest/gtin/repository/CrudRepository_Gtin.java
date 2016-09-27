package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Gtin;

public interface CrudRepository_Gtin extends CrudRepository<Gtin, Long> {

	List<Gtin> findById(@Param("id") long id);

	List<Gtin> findByGtinCode(@Param("gtinCode") String gtinCode);
	
}