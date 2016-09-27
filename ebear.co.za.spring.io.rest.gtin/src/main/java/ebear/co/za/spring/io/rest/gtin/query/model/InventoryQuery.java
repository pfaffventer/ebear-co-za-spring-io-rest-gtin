package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class InventoryQuery {

	private byte active;
	private String inventoryCode;
	private String inventoryDescription;
	private Timestamp logTime;
	private String logUser;
	public InventoryQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InventoryQuery(byte active, String inventoryCode, String inventoryDescription, Timestamp logTime, String logUser) {
		super();
		this.active = active;
		this.inventoryCode = inventoryCode;
		this.inventoryDescription = inventoryDescription;
		this.logTime = logTime;
		this.logUser = logUser;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
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
	public Timestamp getLogTime() {
		return logTime;
	}
	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}
	public String getLogUser() {
		return logUser;
	}
	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

	

}
