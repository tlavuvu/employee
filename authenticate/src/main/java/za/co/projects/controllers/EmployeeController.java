package za.co.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.projects.requests.EmployeeRequest;
import za.co.projects.responses.EmployeeResponse;
import za.co.projects.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<EmployeeResponse> saveEmployee(@RequestBody EmployeeRequest employeeRequest) {
		return new ResponseEntity<EmployeeResponse>(employeeService.saveEmployee(employeeRequest),HttpStatus.CREATED);
	}
}
