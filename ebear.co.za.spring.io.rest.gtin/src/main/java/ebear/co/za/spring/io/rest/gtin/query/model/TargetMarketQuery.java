package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class TargetMarketQuery {

	private byte active;
	private String targetMarketCode;
	private String targetMarketDescription;
	private Timestamp logTime;
	private String logUser;
	public TargetMarketQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TargetMarketQuery(byte active, String targetMarketCode, String targetMarketDescription, Timestamp logTime, String logUser) {
		super();
		this.active = active;
		this.targetMarketCode = targetMarketCode;
		this.targetMarketDescription = targetMarketDescription;
		this.logTime = logTime;
		this.logUser = logUser;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public String getTargetMarketCode() {
		return targetMarketCode;
	}
	public void setTargetMarketCode(String targetMarketCode) {
		this.targetMarketCode = targetMarketCode;
	}
	public String getTargetMarketDescription() {
		return targetMarketDescription;
	}
	public void setTargetMarketDescription(String targetMarketDescription) {
		this.targetMarketDescription = targetMarketDescription;
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
