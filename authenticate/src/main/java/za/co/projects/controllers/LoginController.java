package za.co.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.projects.requests.LoginRequest;
import za.co.projects.responses.LoginResponse;
import za.co.projects.services.AppUserService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000/")
public class LoginController {
	
	@Autowired
	private AppUserService appUserService;
	
	
	@PostMapping
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
		LoginResponse loginResponse = appUserService.login(loginRequest);
		return new ResponseEntity<LoginResponse>(loginResponse,HttpStatus.OK);
	}
	
}//-------------------------------------
