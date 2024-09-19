package za.co.projects.responses;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ResponseAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int StatusCode;
	private String url;
	private String method;
	private Date date;
	private String uniqueID;
	
	public ResponseAudit(Long id, int statusCode, String url, String method, Date date, String uniqueID) {
		super();
		this.id = id;
		StatusCode = statusCode;
		this.url = url;
		this.method = method;
		this.date = date;
		this.uniqueID = uniqueID;
	}

	public ResponseAudit() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStatusCode() {
		return StatusCode;
	}

	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	@Override
	public String toString() {
		return "ResponseAudit [id=" + id + ", StatusCode=" + StatusCode + ", url=" + url + ", method=" + method
				+ ", date=" + date + ", uniqueID=" + uniqueID + "]";
	}
	
	
	
}//-------------------------------
