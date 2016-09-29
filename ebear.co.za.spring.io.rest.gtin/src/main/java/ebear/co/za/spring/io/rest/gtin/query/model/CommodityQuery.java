package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class CommodityQuery {

	private byte active;
	private String commodityCode;
	private String commodityDescription;
	private Timestamp logTime;
	private String logUser;
	
	public CommodityQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommodityQuery(byte active, String commodityCode, String commodityDescription, Timestamp logTime, String logUser) {
		super();
		this.active = active;
		this.commodityCode = commodityCode;
		this.commodityDescription = commodityDescription;
		this.logTime = logTime;
		this.logUser = logUser;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getCommodityDescription() {
		return commodityDescription;
	}
	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
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
