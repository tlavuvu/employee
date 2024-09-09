package za.co.projects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.projects.repositories.EmployeeRepository;
import za.co.projects.requests.EmployeeRequest;
import za.co.projects.responses.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		
	}

}
