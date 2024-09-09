package za.co.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import za.co.projects.requests.LoginRequest;
import za.co.projects.responses.LoginResponse;
import za.co.projects.services.AppUserService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private AppUserService appUserService;
	
	
	@ResponseStatus(code = HttpStatus.CREATED) // 201
	@GetMapping
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		return appUserService.login(loginRequest);
	}
	
}//-------------------------------------
