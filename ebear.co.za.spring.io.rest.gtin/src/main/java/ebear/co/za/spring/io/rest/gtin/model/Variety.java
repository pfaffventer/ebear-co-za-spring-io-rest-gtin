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
@Table(name = "VARIETY",uniqueConstraints=@UniqueConstraint(columnNames={"VARIETY_CODE", "COMMODITY_CODE"}))
public class Variety  extends LogModel {

	@Id
	@Column(name = "VARIETY_ID")
	@GeneratedValue
	private long id;

	@Column(name = "VARIETY_CODE",columnDefinition = "CHAR(3) NOT NULL")
	private String varietyCode;

	@Column(name = "VARIETY_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String varietyDescription;

	@Column(name = "COMMODITY_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String commodityCode;

	@ManyToOne
	@JoinColumn(name = "COMMODITY_ID")
	private Commodity commodity;

	public Variety() {}

	public Variety(LogRecord log,String varietyCode, Commodity commodity,String varietyDescription) {
		super(log);
		this.varietyCode = varietyCode;
		this.varietyDescription = varietyDescription;
		this.commodity = commodity;
		this.commodityCode = commodity.getCommodityCode();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

}
