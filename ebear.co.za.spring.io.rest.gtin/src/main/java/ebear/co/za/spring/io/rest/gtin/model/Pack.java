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
@Table(name = "PACK",uniqueConstraints=@UniqueConstraint(columnNames={"PACK_CODE", "COMMODITY_CODE"}))
public class Pack  extends LogModel {

	@Id
	@Column(name = "PACK_ID")
	@GeneratedValue
	private long id;

	@Column(name = "PACK_CODE",columnDefinition = "CHAR(4) NOT NULL")
	private String packCode;

	@Column(name = "PACK_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String packDescription;

	@Column(name = "COMMODITY_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String commodityCode;

	@ManyToOne
	@JoinColumn(name = "COMMODITY_ID")
	private Commodity commodity;

	@Column(columnDefinition = "CHAR(1) NOT NULL")
	private String unit;
	
	@Column(columnDefinition = "CHAR(4) NOT NULL")
	private String equivalentPack;

	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float innerLength;
	
	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float innerWidth;

	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float innerHeight;

	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float outerLength;
	
	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float outerWidth;

	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float outerHeight;
	
	@Column(columnDefinition = "FLOAT NOT NULL")
	private Float netWeight;

	public Pack() {}

	public Pack(LogRecord log, 
			String packCode, 
			String packDescription,
			String commodityCode, 
			String unit, 
			String equivalentPack,
			Float innerLength, 
			Float innerWidth, 
			Float innerHeight,
			Float outerLength,
			Float outerWidth,
			Float outerHeight,
			Float netWeight,
			Commodity commodity) {
		super(log);
		this.packCode = packCode;
		this.packDescription = packDescription;
		this.commodityCode = commodityCode;
		this.unit = unit;
		this.equivalentPack = equivalentPack;
		this.innerLength = innerLength;
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.outerLength = outerLength;
		this.outerWidth = outerWidth;
		this.outerHeight = outerHeight;
		this.netWeight = netWeight;
		this.commodity = commodity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getPackCode() {
		return packCode;
	}

	public void setPackCode(String packCode) {
		this.packCode = packCode;
	}

	public String getPackDescription() {
		return packDescription;
	}

	public void setPackDescription(String packDescription) {
		this.packDescription = packDescription;
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getEquivalentPack() {
		return equivalentPack;
	}

	public void setEquivalentPack(String equivalentPack) {
		this.equivalentPack = equivalentPack;
	}

	public Float getInnerLength() {
		return innerLength;
	}

	public void setInnerLength(Float innerLength) {
		this.innerLength = innerLength;
	}

	public Float getInnerWidth() {
		return innerWidth;
	}

	public void setInnerWidth(Float innerWidth) {
		this.innerWidth = innerWidth;
	}

	public Float getInnerHeight() {
		return innerHeight;
	}

	public void setInnerHeight(Float innerHeight) {
		this.innerHeight = innerHeight;
	}

	public Float getOuterLength() {
		return outerLength;
	}

	public void setOuterLength(Float outerLength) {
		this.outerLength = outerLength;
	}

	public Float getOuterWidth() {
		return outerWidth;
	}

	public void setOuterWidth(Float outerWidth) {
		this.outerWidth = outerWidth;
	}

	public Float getOuterHeight() {
		return outerHeight;
	}

	public void setOuterHeight(Float outerHeight) {
		this.outerHeight = outerHeight;
	}

	public Float getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(Float netWeight) {
		this.netWeight = netWeight;
	}

	

}
