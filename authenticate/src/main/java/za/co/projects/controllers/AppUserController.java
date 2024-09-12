package za.co.projects.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.projects.requests.AppUserRequest;
import za.co.projects.responses.AppUserResponse;
import za.co.projects.services.AppUserService;

@RestController
@RequestMapping("/appuser")
public class AppUserController {
	
	@Autowired
	private AppUserService appUserService;
	
	@PostMapping
	public ResponseEntity<AppUserResponse> saveAppUser(@RequestBody AppUserRequest appUserRequest) {
		return new ResponseEntity<AppUserResponse>(appUserService.saveAppUser(appUserRequest),HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<AppUserResponse>> getAppUsers(){
		return new ResponseEntity<List<AppUserResponse>>(appUserService.getAllAppUsers(),HttpStatus.OK);
	}

}
