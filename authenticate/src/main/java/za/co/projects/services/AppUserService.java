package za.co.projects.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.projects.entities.AppUser;
import za.co.projects.entities.Employee;
import za.co.projects.repositories.AppUserRepository;
import za.co.projects.repositories.EmployeeRepository;
import za.co.projects.requests.AppUserRequest;
import za.co.projects.requests.LoginRequest;
import za.co.projects.responses.AppUserResponse;
import za.co.projects.responses.LoginResponse;

@Service
public class AppUserService {
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	public AppUserResponse saveAppUser(AppUserRequest appUserRequest) {
		AppUser user = appUserRepository.save(appUserRequestToAppUser(appUserRequest));
		return AppUserToAppUserResponse(user);
	}
	
	public List<AppUserResponse> getAllAppUsers(){
		List<AppUser> appUsers = appUserRepository.findAll();
		return appUsers.stream().map(this::AppUserToAppUserResponse).toList();
	}
	
	public AppUserResponse searchAppUser(String username) {
		Optional<AppUser> appUserO = appUserRepository.findByUsername(username);
		AppUser appUser = new AppUser();
		AppUserResponse appUserResponse = new AppUserResponse();
		if(appUserO.isPresent()) {
			appUser = appUserO.get();
			appUserResponse = AppUserToAppUserResponse(appUser);
			appUserResponse.setResponseStatus("success");
		}else {
			appUserResponse.setMessage("User not found");
			appUserResponse.setResponseStatus("failure");
		}
		return appUserResponse;
	}
	
	public LoginResponse login(LoginRequest loginRequest) {
		Optional<AppUser> appUserO = appUserRepository.findByUsername(loginRequest.getUsername());
		AppUser appUser =  new AppUser();
		LoginResponse loginResponse = new LoginResponse();
		if(appUserO.isPresent()) {
			appUser = appUserO.get();
			if(loginRequest.getPassword().equals(appUser.getPassword())) {
				Optional<Employee> employeeO = employeeRepository.findByUsername(loginRequest.getUsername());
				if(employeeO.isPresent()) {
					Employee employee = employeeO.get();
					loginResponse.setName(employee.getName());
					loginResponse.setEmployeeNumber(employee.getEmployeeNumber());
					loginResponse.setSurname(employee.getSurname());
					loginResponse.setUsername(loginRequest.getUsername());
					loginResponse.setIdNumber(employee.getIdnumber());
					loginResponse.setAddress(employee.getAddress());
					loginResponse.setMessage("success");
					loginResponse.setEmail(appUser.getEmail());
					loginResponse.setRole(appUser.getRole());
					loginResponse.setLoginStatus("sucess");
				}else {
					loginResponse.setMessage("Employee not found" );
					loginResponse.setLoginStatus("failure");
				}
			}else {
				loginResponse.setMessage("Username/Password is incorrect" );
				loginResponse.setLoginStatus("failure");
			}
		}else {
			loginResponse.setMessage("Username/Password is incorrect" );
			loginResponse.setLoginStatus("failure");
		}
		
		return loginResponse;
	}
	
	public AppUser appUserRequestToAppUser(AppUserRequest appUserRequest) {
		AppUser appuser = new AppUser();
		appuser.setEmail(appUserRequest.getEmail());
		appuser.setPassword(appUserRequest.getPassword());
		appuser.setRole(appUserRequest.getRole());
		appuser.setUsername(appUserRequest.getUsername());
		return appuser;
	}
	
	public AppUserResponse AppUserToAppUserResponse(AppUser appUser) {
		return new AppUserResponse(appUser.getId(),
				appUser.getUsername(), 
				appUser.getPassword(), 
				appUser.getEmail(), 
				appUser.getRole());
	}

}
