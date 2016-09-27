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
@Table(name = "APPLICATION_PROPERTIES", uniqueConstraints=@UniqueConstraint(columnNames={"PROPERTY_CODE"}))
public class ApplicationProperty extends LogModel {
	
    @Id
    @Column(name = "PROPERTY_ID")
    @GeneratedValue
    private long id;

	@Column(name = "PROPERTY_CODE",columnDefinition = "VARCHAR(255) NOT NULL")
	private String propertyCode;

	@Column(name = "PROPERTY_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String propertyDescription;

	public ApplicationProperty() {}

	public ApplicationProperty(LogRecord log,String propertyCode,String propertyDescription) {
		super(log);
		this.propertyCode = propertyCode;
		this.propertyDescription = propertyDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPropertyCode() {
		return propertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

}
