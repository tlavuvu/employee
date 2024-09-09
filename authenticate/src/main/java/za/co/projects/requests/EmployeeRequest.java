package za.co.projects.requests;

import org.springframework.stereotype.Component;

import za.co.projects.entities.Address;
import za.co.projects.entities.EmployeeLeave;

@Component
public class EmployeeRequest {
	
	private String employeeNumber;
	private String username;
	private EmployeeLeave leave;
	private Address address;
	
	public EmployeeRequest(String employeeNumber, String username, EmployeeLeave leave, Address address) {
		super();
		this.employeeNumber = employeeNumber;
		this.username = username;
		this.leave = leave;
		this.address = address;
	}

	public EmployeeRequest() {
		super();
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
		return "EmployeeRequest [employeeNumber=" + employeeNumber + ", username=" + username + ", leave=" + leave
				+ ", address=" + address + "]";
	}


	

}//-----------------------------------------
