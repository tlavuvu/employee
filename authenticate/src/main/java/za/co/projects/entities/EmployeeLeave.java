package za.co.projects.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeLeave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private double leaveDays;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public EmployeeLeave(Long id, double leaveDays, Employee employee) {
		super();
		this.id = id;
		this.leaveDays = leaveDays;
		this.employee = employee;
	}

	public EmployeeLeave() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(double leaveDays) {
		this.leaveDays = leaveDays;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeLeave [id=" + id + ", leaveDays=" + leaveDays + ", employee=" + employee + "]";
	}

	
}//------------------
