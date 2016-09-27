package ebear.co.za.spring.io.rest.gtin.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.gtin.model.base.LogModel;
import ebear.co.za.spring.io.rest.gtin.model.base.LogRecord;

@Entity
@Table(name = "GTIN_MARKET",uniqueConstraints=@UniqueConstraint(columnNames={"GTIN_CODE", "TARGET_MARKET_CODE"}))
public class GtinMarket extends LogModel {
	
    @Id
    @Column(name = "GTIN_MARKET_ID")
    @GeneratedValue
    private long id;

	@Column(name = "GTIN_CODE",columnDefinition = "CHAR(14) NOT NULL")
	private String gtinCode;
	
	@Column(name = "TARGET_MARKET_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String targetMarketCode;

	@ManyToOne
	@JoinColumn(name = "GTIN_ID")
	private Gtin gtin;
	
	@ManyToOne
	@JoinColumn(name = "TARGET_MARKET_ID")
	private TargetMarket targetMarket;

	public GtinMarket() {}

	public GtinMarket(LogRecord log, String gtinCode, String targetMarketCode, Gtin gtin, TargetMarket targetMarket) {
		super(log);
		this.gtinCode = gtinCode;
		this.targetMarketCode = targetMarketCode;
		this.gtin = gtin;
		this.targetMarket = targetMarket;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGtinCode() {
		return gtinCode;
	}

	public void setGtinCode(String gtinCode) {
		this.gtinCode = gtinCode;
	}

	public String getTargetMarketCode() {
		return targetMarketCode;
	}

	public void setTargetMarketCode(String targetMarketCode) {
		this.targetMarketCode = targetMarketCode;
	}

	public Gtin getGtin() {
		return gtin;
	}

	public void setGtin(Gtin gtin) {
		this.gtin = gtin;
	}

	public TargetMarket getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(TargetMarket targetMarket) {
		this.targetMarket = targetMarket;
	}
	
	

}
