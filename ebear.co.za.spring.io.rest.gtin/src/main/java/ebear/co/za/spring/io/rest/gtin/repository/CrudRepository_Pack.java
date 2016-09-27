package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Pack;

public interface CrudRepository_Pack extends CrudRepository<Pack, Long> {

	List<Pack> findById(@Param("id") long id);

}