package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class VarietyJoinCommodity {

	private byte active;
	private String commodityCode;
	private String commodityDescription;
	private String varietyCode;
	private String varietyDescription;
	private Timestamp logTime;
	private String logUser;
	public VarietyJoinCommodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VarietyJoinCommodity(byte active, String commodityCode, String commodityDescription, String varietyCode, String varietyDescription,
			Timestamp logTime, String logUser) {
		super();
		this.active = active;
		this.commodityCode = commodityCode;
		this.commodityDescription = commodityDescription;
		this.varietyCode = varietyCode;
		this.varietyDescription = varietyDescription;
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

	public String getVarietyCode() {
		return varietyCode;
	}
	public void setVarietyCode(String varietyCode) {
		this.varietyCode = varietyCode;
	}

	public String getVarietyDescription() {
		return varietyDescription;
	}

	public void setVarietyDescription(String varietyDescription) {
		this.varietyDescription = varietyDescription;
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
