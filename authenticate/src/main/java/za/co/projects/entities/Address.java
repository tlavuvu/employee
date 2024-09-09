package za.co.projects.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String houseNumber;
	private String streetName;
	private String town;
	private String postalCode;
	
	@OneToOne
	private Employee employee;

	public Address(Long id, String houseNumber, String streetName, String town, String postalCode, Employee employee) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.town = town;
		this.postalCode = postalCode;
		this.employee = employee;
	}

	public Address() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", streetName=" + streetName + ", town=" + town
				+ ", postalCode=" + postalCode + ", employee=" + employee + "]";
	}

	

}//----------------------
