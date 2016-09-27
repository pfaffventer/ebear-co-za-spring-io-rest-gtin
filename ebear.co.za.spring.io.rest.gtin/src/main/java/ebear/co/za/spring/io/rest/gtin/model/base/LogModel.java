package ebear.co.za.spring.io.rest.gtin.model.base;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class LogModel {

	@Column(columnDefinition = "TINYINT NOT NULL DEFAULT 0")
	private byte active;

	@Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp logTime;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL")
	private String logUser;

	public LogModel() {}
	
	public LogModel(LogRecord log) {
		super();
		this.logUser = log.getLogUser();
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
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
