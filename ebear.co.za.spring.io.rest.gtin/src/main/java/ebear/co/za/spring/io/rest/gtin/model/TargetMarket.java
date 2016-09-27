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
@Table(name = "TARGET_MARKET", uniqueConstraints=@UniqueConstraint(columnNames={"TARGET_MARKET_CODE"}))
public class TargetMarket extends LogModel {
	
    @Id
    @Column(name = "TARGET_MARKET_ID")
    @GeneratedValue
    private long id;

	@Column(name = "TARGET_MARKET_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String targetMarketCode;

	@Column(name = "TARGET_MARKET_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String targetMarketDescription;

	public TargetMarket() {}

	public TargetMarket(LogRecord log,String targetMarketCode,String targetMarketDescription) {
		super(log);
		this.targetMarketCode = targetMarketCode;
		this.targetMarketDescription = targetMarketDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
