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
@Table(name = "MARK", uniqueConstraints=@UniqueConstraint(columnNames={"MARK_CODE"}))
public class Mark extends LogModel {
	
    @Id
    @Column(name = "MARK_ID")
    @GeneratedValue
    private long id;

	@Column(name = "MARK_CODE",columnDefinition = "CHAR(5) NOT NULL")
	private String markCode;

	@Column(name = "MARK_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String markDescription;

	public Mark() {}

	public Mark(LogRecord log,String markCode,String markDescription) {
		super(log);
		this.markCode = markCode;
		this.markDescription = markDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarkCode() {
		return markCode;
	}

	public void setMarkCode(String markCode) {
		this.markCode = markCode;
	}

	public String getMarkDescription() {
		return markDescription;
	}

	public void setMarkDescription(String markDescription) {
		this.markDescription = markDescription;
	}

}
