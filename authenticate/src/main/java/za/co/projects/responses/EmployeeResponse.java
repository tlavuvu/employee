package za.co.projects.responses;

import za.co.projects.entities.Address;
import za.co.projects.entities.EmployeeLeave;

public class EmployeeResponse {
	
	private Long id;
	private String name;
	private String surname;
	private String idnumber;
	private String employeeNumber;
	private String username;
	private EmployeeLeave leave;
	private Address address;
	private String email;
	private String mobile;
	private String status;
	private String message;
	
	
	public EmployeeResponse(Long id, String name, String surname, String idnumber, String employeeNumber,
			String username, EmployeeLeave leave, Address address, String email, String mobile, String status,
			String message) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
		this.employeeNumber = employeeNumber;
		this.username = username;
		this.leave = leave;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.status = status;
		this.message = message;
	}

	public EmployeeResponse(Long id, String name, String surname, String idnumber, String employeeNumber,
			String username, EmployeeLeave leave, Address address, String email, String mobile) {
		super();
		this.id = id;
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

	public EmployeeResponse(Long id, String name, String surname, String idnumber, String employeeNumber,
			String username, EmployeeLeave leave, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [id=" + id + ", name=" + name + ", surname=" + surname + ", idnumber=" + idnumber
				+ ", employeeNumber=" + employeeNumber + ", username=" + username + ", leave=" + leave + ", address="
				+ address + ", email=" + email + ", mobile=" + mobile + ", status=" + status + ", message=" + message
				+ "]";
	}
	
}//--------------------------
