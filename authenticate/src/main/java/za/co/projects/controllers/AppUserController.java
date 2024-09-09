package za.co.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import za.co.projects.requests.AppUserRequest;
import za.co.projects.responses.AppUserResponse;
import za.co.projects.services.AppUserService;

@RestController
@RequestMapping("/appuser")
public class AppUserController {
	
	@Autowired
	private AppUserService appUserService;
	
	@ResponseStatus(code = HttpStatus.CREATED) // 201
	@PostMapping
	public AppUserResponse saveAppUser(@RequestBody AppUserRequest appUserRequest) {
		return appUserService.saveAppUser(appUserRequest);
	}

}
