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
@Table(name = "GTIN", uniqueConstraints=@UniqueConstraint(columnNames={"GTIN_CODE"}))
public class Gtin extends LogModel {
	
    @Id
    @Column(name = "GTIN_ID")
    @GeneratedValue
    private long id;

	@Column(name = "GTIN_CODE",columnDefinition = "CHAR(14) NOT NULL")
	private String gtinCode;

	@Column(name = "commodity",columnDefinition = "CHAR(2) NOT NULL")
	private String commodity;

	@Column(name = "variety",columnDefinition = "CHAR(3) NOT NULL")
	private String variety;

	@Column(name = "grade",columnDefinition = "CHAR(4) NOT NULL")
	private String grade;

	@Column(name = "pack",columnDefinition = "CHAR(4) NOT NULL")
	private String pack;

	@Column(name = "mark",columnDefinition = "CHAR(5) NOT NULL")
	private String mark;
	
	@Column(name = "inventory",columnDefinition = "CHAR(2) NOT NULL")
	private String inventory;

	@Column(name = "size_count",columnDefinition = "CHAR(5) NOT NULL")
	private String sizeCount;

	public Gtin() {}

	public Gtin(LogRecord log,
			String gtinCode,
			String commodity,
			String variety,
			String grade,
			String pack,
			String mark,
			String inventory,
			String sizeCount) {
		super(log);
		this.gtinCode = gtinCode;
		this.commodity = commodity;
		this.variety = variety;
		this.grade = grade;
		this.pack = pack;
		this.mark = mark;
		this.inventory = inventory;
		this.sizeCount = sizeCount;
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

}
