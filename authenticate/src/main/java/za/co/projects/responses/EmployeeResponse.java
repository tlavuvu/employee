package za.co.projects.responses;

import za.co.projects.entities.Address;
import za.co.projects.entities.EmployeeLeave;

public class EmployeeResponse {
	
	private Long id;
	private String employeeNumber;
	private String username;
	private EmployeeLeave leave;
	private Address address;
	
	public EmployeeResponse(Long id, String employeeNumber, String username, EmployeeLeave leave, Address address) {
		super();
		this.id = id;
		this.employeeNumber = employeeNumber;
		this.username = username;
		this.leave = leave;
		this.address = address;
	}

	public EmployeeResponse() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public EmployeeLeave getLeave() {
		return leave;
	}

	public void setLeave(EmployeeLeave leave) {
		this.leave = leave;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [id=" + id + ", employeeNumber=" + employeeNumber + ", username=" + username
				+ ", leave=" + leave + ", address=" + address + "]";
	}
	
	

}//--------------------------
