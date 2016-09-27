package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Grade;

public interface CrudRepository_Grade extends CrudRepository<Grade, Long> {

	List<Grade> findById(@Param("id") long id);

	List<Grade> findByGradeCode(@Param("gradeCode") String gradeCode);
	
}