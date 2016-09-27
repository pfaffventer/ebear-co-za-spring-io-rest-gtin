package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.ApplicationProperty;

public interface CrudRepository_ApplicationProperty extends CrudRepository<ApplicationProperty, Long> {

	List<ApplicationProperty> findById(@Param("id") long id);

}