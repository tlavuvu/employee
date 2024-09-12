package za.co.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.projects.requests.LoginRequest;
import za.co.projects.responses.LoginResponse;
import za.co.projects.services.AppUserService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private AppUserService appUserService;
	
	
	@GetMapping
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
		return new ResponseEntity<LoginResponse>(appUserService.login(loginRequest),HttpStatus.OK);
	}
	
}//-------------------------------------
