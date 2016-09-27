package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class PackJoinCommodity {
	
	private byte active;
	private String packCode;
	private String packDescription;
	private Timestamp logTime;
	private String logUser;
	private String commodityCode;
	private String commodityDescription;
	private String unit;
	private String equivalentPack;
	private Float innerLength;
	private Float innerWidth;
	private Float innerHeight;
	private Float outerLength;
	private Float outerWidth;
	private Float outerHeight;
	private Float netWeight;
	public PackJoinCommodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackJoinCommodity(byte active, String packCode, String packDescription, Timestamp logTime, String logUser,
			String commodityCode, String commodityDescription, String unit, String equivalentPack, Float innerLength,
			Float innerWidth, Float innerHeight, Float outerLength, Float outerWidth, Float outerHeight,
			Float netWeight) {
		super();
		this.active = active;
		this.packCode = packCode;
		this.packDescription = packDescription;
		this.logTime = logTime;
		this.logUser = logUser;
		this.commodityCode = commodityCode;
		this.commodityDescription = commodityDescription;
		this.unit = unit;
		this.equivalentPack = equivalentPack;
		this.innerLength = innerLength;
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.outerLength = outerLength;
		this.outerWidth = outerWidth;
		this.outerHeight = outerHeight;
		this.netWeight = netWeight;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
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
