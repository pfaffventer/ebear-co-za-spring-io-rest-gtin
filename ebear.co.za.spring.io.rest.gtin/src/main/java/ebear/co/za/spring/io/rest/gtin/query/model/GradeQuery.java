package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class GradeQuery {

	private byte active;
	private String gradeCode;
	private String gradeDescription;
	private Timestamp logTime;
	private String logUser;
	public GradeQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GradeQuery(byte active, String gradeCode, String gradeDescription, Timestamp logTime, String logUser) {
		super();
		this.active = active;
		this.gradeCode = gradeCode;
		this.gradeDescription = gradeDescription;
		this.logTime = logTime;
		this.logUser = logUser;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public String getGradeCode() {
		return gradeCode;
	}
	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}
	public String getGradeDescription() {
		return gradeDescription;
	}
	public void setGradeDescription(String gradeDescription) {
		this.gradeDescription = gradeDescription;
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
