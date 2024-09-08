package za.co.projects.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee extends Person{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String employeeNumber;
	private String username;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeLeave leave;
	
	@OneToOne
	private Address address;

	public Employee(String name, String surname, String idnumber, Address address, Long id, String employeeNumber,
			String username, EmployeeLeave leave, Address address2) {
		super(name, surname, idnumber, address);
		this.id = id;
		this.employeeNumber = employeeNumber;
		this.username = username;
		this.leave = leave;
		address = address2;
	}

	public Employee() {
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
		return "Employee [id=" + id + ", employeeNumber=" + employeeNumber + ", username=" + username + ", leave="
				+ leave + ", address=" + address + "]";
	}

	
}//---------------
