package za.co.projects.services;

import java.util.List;
import java.util.Optional;

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
	
	public List<EmployeeResponse> getAllEmployees(){
		List<Employee> employees =  employeeRepository.findAll();
		return employees.stream().map(this::mapEmployeeToEmployeeResponse).toList();
	}
	
	public EmployeeResponse searchEmployee(String idnumber) {
		Optional<Employee> employeeO = employeeRepository.findByIdnumber(idnumber);
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(employeeO.isPresent()) {
			employeeResponse = mapEmployeeToEmployeeResponse(employeeO.get());
			employeeResponse.setStatus("success");
			employeeResponse.setMessage("success");
		}else {
			employeeResponse.setStatus("failure");
			employeeResponse.setMessage("Employee not found");
			return employeeResponse;
		}
		return employeeResponse;
	}
	
	public EmployeeResponse mapEmployeeToEmployeeResponse(Employee employee) {
		return new EmployeeResponse(employee.getId(),
				employee.getName(),
				employee.getSurname(),
				employee.getIdnumber(),
				employee.getEmployeeNumber(),
				employee.getUsername(),
				employee.getLeave(),
				employee.getAddress(),
				employee.getEmail(),
				employee.getMobile());
		
	}
	
	public Employee mapEmployeeRequestToEmployee(EmployeeRequest employeeRequest) {
		return new Employee(employeeRequest.getName(),
				employeeRequest.getSurname(),
				employeeRequest.getIdnumber(),
				employeeRequest.getEmployeeNumber(),
				employeeRequest.getUsername(),
				employeeRequest.getEmail(),
				employeeRequest.getMobile(),
				employeeRequest.getLeave(),
				employeeRequest.getAddress());
	}

}//----------------------------------
