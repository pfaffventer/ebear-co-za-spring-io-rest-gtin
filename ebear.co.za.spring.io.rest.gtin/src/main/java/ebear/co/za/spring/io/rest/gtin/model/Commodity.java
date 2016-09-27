package ebear.co.za.spring.io.rest.gtin.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.gtin.model.base.LogModel;
import ebear.co.za.spring.io.rest.gtin.model.base.LogRecord;

@Entity
@Table(name = "COMMODITY", uniqueConstraints=@UniqueConstraint(columnNames={"COMMODITY_CODE"}))
public class Commodity extends LogModel {
	
    @Id
    @Column(name = "COMMODITY_ID")
    @GeneratedValue
    private long id;

	@Column(name = "COMMODITY_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String commodityCode;

	@Column(name = "COMMODITY_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String commodityDescription;

	
	@OneToMany(mappedBy = "commodity", cascade = CascadeType.ALL)
	private Set<Variety> varieties;

	@OneToMany(mappedBy = "commodity", cascade = CascadeType.ALL)
	Set<Pack> packs;
	
	public Commodity() {}

	public Commodity(LogRecord log,String commodityCode,String commodityDescription) {
		super(log);
		this.commodityCode = commodityCode;
		this.commodityDescription = commodityDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Set<Variety> getVarieties() {
		return varieties;
	}

	public void setVarieties(Set<Variety> varieties) {
		this.varieties = varieties;
	}

	public Set<Pack> getPacks() {
		return packs;
	}

	public void setPacks(Set<Pack> packs) {
		this.packs = packs;
	}

}
