package ebear.co.za.spring.io.rest.gtin.query.model;

import java.sql.Timestamp;

public class GtinJoinTargetMarket {

	public GtinJoinTargetMarket() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String targetMarketCode;

	private String gtinCode;
	
	private String commodity;
	private String variety;
	private String grade;
	private String pack;
	private String mark;
	private String inventory;
	private String sizeCount;
	
	private Timestamp logTime;
	private String logUser;
	public GtinJoinTargetMarket(String targetMarketCode, String gtinCode, String commodity, String variety, String grade,
			String pack, String mark, String inventory, String sizeCount, Timestamp logTime, String logUser) {
		super();
		this.targetMarketCode = targetMarketCode;
		this.gtinCode = gtinCode;
		this.commodity = commodity;
		this.variety = variety;
		this.grade = grade;
		this.pack = pack;
		this.mark = mark;
		this.inventory = inventory;
		this.sizeCount = sizeCount;
		this.logTime = logTime;
		this.logUser = logUser;
	}
	public String getTargetMarketCode() {
		return targetMarketCode;
	}

	public void setTargetMarketCode(String targetMarketCode) {
		this.targetMarketCode = targetMarketCode;
	}

	public String getGtinCode() {
		return gtinCode;
	}
	public void setGtinCode(String gtinCode) {
		this.gtinCode = gtinCode;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPack() {
		return pack;
	}
	public void setPack(String pack) {
		this.pack = pack;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	public String getSizeCount() {
		return sizeCount;
	}
	public void setSizeCount(String sizeCount) {
		this.sizeCount = sizeCount;
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
