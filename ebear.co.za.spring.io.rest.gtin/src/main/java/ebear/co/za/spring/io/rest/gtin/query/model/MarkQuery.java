package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class MarkQuery {

	private byte active;
	private String markCode;
	private String markDescription;
	private Timestamp logTime;
	private String logUser;
	public MarkQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarkQuery(byte active, String markCode, String markDescription, Timestamp logTime, String logUser) {
		super();
		this.active = active;
		this.markCode = markCode;
		this.markDescription = markDescription;
		this.logTime = logTime;
		this.logUser = logUser;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public String getMarkCode() {
		return markCode;
	}
	public void setMarkCode(String markCode) {
		this.markCode = markCode;
	}
	public String getMarkDescription() {
		return markDescription;
	}
	public void setMarkDescription(String markDescription) {
		this.markDescription = markDescription;
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
