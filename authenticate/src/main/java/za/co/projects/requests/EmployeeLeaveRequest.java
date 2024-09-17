package za.co.projects.requests;

import za.co.projects.entities.Employee;

public class EmployeeLeaveRequest {

	private double leaveDays;
	private double leaveDaysRequested;
	private Employee employee;
	
	public EmployeeLeaveRequest(double leaveDays, double leaveDaysRequested, Employee employee) {
		super();
		this.leaveDays = leaveDays;
		this.leaveDaysRequested = leaveDaysRequested;
		this.employee = employee;
	}

	public EmployeeLeaveRequest() {
		super();
	}

	public double getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(double leaveDays) {
		this.leaveDays = leaveDays;
	}

	public double getLeaveDaysRequested() {
		return leaveDaysRequested;
	}

	public void setLeaveDaysRequested(double leaveDaysRequested) {
		this.leaveDaysRequested = leaveDaysRequested;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeLeaveRequest [leaveDays=" + leaveDays + ", leaveDaysRequested=" + leaveDaysRequested
				+ ", employee=" + employee + "]";
	}
	
	
}//--------------------------------
