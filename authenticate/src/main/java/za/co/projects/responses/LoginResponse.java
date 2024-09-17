package za.co.projects.responses;

import za.co.projects.entities.Address;

public class LoginResponse {
	
	private String message;
	private String name;
	private String surname;
	private String idNumber;
	private String employeeNumber;
	private Address address;
	private String username;
	private String email;
	private String role;
	private String loginStatus;
	
	public LoginResponse(String message, String name, String surname, String idNumber, String employeeNumber,
			Address address, String username, String email, String role, String loginStatus) {
		super();
		this.message = message;
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
		this.employeeNumber = employeeNumber;
		this.address = address;
		this.username = username;
		this.email = email;
		this.role = role;
		this.loginStatus = loginStatus;
	}

	public LoginResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "LoginResponse [message=" + message + ", name=" + name + ", surname=" + surname + ", idNumber="
				+ idNumber + ", employeeNumber=" + employeeNumber + ", address=" + address + ", username=" + username
				+ ", email=" + email + ", role=" + role + ", loginStatus=" + loginStatus + "]";
	}
	
	
}//---------------------------
