package za.co.projects.requests;

import org.springframework.stereotype.Component;

import za.co.projects.entities.Address;
import za.co.projects.entities.EmployeeLeave;

@Component
public class EmployeeRequest {
	
	private String name;
	private String surname;
	private String idnumber;
	private String employeeNumber;
	private String username;
	private EmployeeLeave leave;
	private Address address;
	private String email;
	private String mobile;
	
	public EmployeeRequest(String name, String surname, String idnumber, String employeeNumber, String username,
			EmployeeLeave leave, Address address, String email, String mobile) {
		super();
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
		this.employeeNumber = employeeNumber;
		this.username = username;
		this.leave = leave;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	public EmployeeRequest(String name, String surname, String idnumber, String employeeNumber, String username,
			EmployeeLeave leave, Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
		this.employeeNumber = employeeNumber;
		this.username = username;
		this.leave = leave;
		this.address = address;
	}

	public EmployeeRequest(String name, String surname, String idnumber, String employeeNumber, EmployeeLeave leave,
			Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
		this.employeeNumber = employeeNumber;
		this.leave = leave;
		this.address = address;
	}



	public EmployeeRequest() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [name=" + name + ", surname=" + surname + ", idnumber=" + idnumber + ", employeeNumber="
				+ employeeNumber + ", username=" + username + ", leave=" + leave + ", address=" + address + ", email="
				+ email + ", mobile=" + mobile + "]";
	}

	
	
	

}//-----------------------------------------
