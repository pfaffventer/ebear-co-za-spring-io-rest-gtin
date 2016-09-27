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
@Table(name = "GRADE", uniqueConstraints=@UniqueConstraint(columnNames={"GRADE_CODE"}))
public class Grade extends LogModel {
	
    @Id
    @Column(name = "COMMODITY_ID")
    @GeneratedValue
    private long id;

	@Column(name = "GRADE_CODE",columnDefinition = "CHAR(2) NOT NULL")
	private String gradeCode;

	@Column(name = "GRADE_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String gradeDescription;

	public Grade() {}

	public Grade(LogRecord log,String gradeCode,String gradeDescription) {
		super(log);
		this.gradeCode = gradeCode;
		this.gradeDescription = gradeDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public String getGradeDescription() {
		return gradeDescription;
	}

	public void setGradeDescription(String gradeDescription) {
		this.gradeDescription = gradeDescription;
	}

	
}
