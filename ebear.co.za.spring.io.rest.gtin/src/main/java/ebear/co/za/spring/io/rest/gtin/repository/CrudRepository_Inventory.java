package ebear.co.za.spring.io.rest.gtin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ebear.co.za.spring.io.rest.gtin.model.Inventory;

public interface CrudRepository_Inventory extends CrudRepository<Inventory, Long> {

	List<Inventory> findById(@Param("id") long id);

	List<Inventory> findByInventoryCode(@Param("inventoryCode") String inventoryCode);
	
}