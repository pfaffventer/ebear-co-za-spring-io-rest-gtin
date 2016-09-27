package ebear.co.za.spring.io.rest.gtin.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.gtin.model.base.LogModel;
import ebear.co.za.spring.io.rest.gtin.model.base.LogRecord;

@Entity
@Table(name = "INVENTORY", uniqueConstraints=@UniqueConstraint(columnNames={"INVENTORY_CODE"}))
public class Inventory extends LogModel {
	
    @Id
    @Column(name = "INVENTORY_ID")
    @GeneratedValue
    private long id;

	@Column(name = "INVENTORY_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String inventoryCode;

	@Column(name = "INVENTORY_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String inventoryDescription;

	public Inventory() {}

	public Inventory(LogRecord log,String inventoryCode,String inventoryDescription) {
		super(log);
		this.inventoryCode = inventoryCode;
		this.inventoryDescription = inventoryDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInventoryCode() {
		return inventoryCode;
	}

	public void setInventoryCode(String inventoryCode) {
		this.inventoryCode = inventoryCode;
	}

	public String getInventoryDescription() {
		return inventoryDescription;
	}

	public void setInventoryDescription(String inventoryDescription) {
		this.inventoryDescription = inventoryDescription;
	}

}
