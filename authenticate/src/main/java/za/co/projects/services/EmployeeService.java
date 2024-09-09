package za.co.projects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.projects.entities.Employee;
import za.co.projects.repositories.EmployeeRepository;
import za.co.projects.requests.EmployeeRequest;
import za.co.projects.responses.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		Employee employee = mapEmployeeRequestToEmployee(employeeRequest);
		return mapEmployeeToEmployeeResponse(employeeRepository.save(employee));	
	}
	
	public EmployeeResponse mapEmployeeToEmployeeResponse(Employee employee) {
		return new EmployeeResponse(employee.getId(),
				employee.getName(),
				employee.getSurname(),
				employee.getIdnumber(),
				employee.getEmployeeNumber(),
				employee.getUsername(),
				employee.getLeave(),
				employee.getAddress());
	}
	
	public Employee mapEmployeeRequestToEmployee(EmployeeRequest employeeRequest) {
		return new Employee(employeeRequest.getName(),
				employeeRequest.getSurname(),
				employeeRequest.getIdnumber(),
				employeeRequest.getEmployeeNumber(),
				employeeRequest.getUsername(),
				employeeRequest.getLeave(),
				employeeRequest.getAddress());
	}

}//----------------------------------
