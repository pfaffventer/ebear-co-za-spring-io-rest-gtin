package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Mark;

public interface CrudRepository_Mark extends CrudRepository<Mark, Long> {

	List<Mark> findById(@Param("id") long id);

	List<Mark> findByMarkCode(@Param("markCode") String markCode);
}