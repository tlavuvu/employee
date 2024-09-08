package za.co.projects.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import za.co.projects.entities.AppUser;
import za.co.projects.repositories.AppUserRepository;
import za.co.projects.requests.AppUserRequest;
import za.co.projects.requests.LoginRequest;
import za.co.projects.responses.AppUserResponse;
import za.co.projects.responses.LoginResponse;

@Service
public class AppUserService {
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private AppUserResponse appUserResponse;
	
	@Autowired
	private AppUser appUser;
	
//	public AppUserService(AppUserRepository appUserRepository) {
//		super();
//		this.appUserRepository = appUserRepository;
//	}

	public AppUserResponse saveAppUser(AppUserRequest appUserRequest) {
		AppUser user = appUserRepository.save(appUserRequestToAppUser(appUserRequest));
		return AppUserToAppUserResponse(user);
	}
	
	public List<AppUserResponse> getAllAppUsers(){
		List<AppUser> appUsers = appUserRepository.findAll();
		return appUsers.stream().map(this::AppUserToAppUserResponse).toList();
	}
	
	public LoginResponse login(LoginRequest loginRequest) {
		Optional<AppUser> appUserO = appUserRepository.findByUsername(loginRequest.getUsername());
		if(appUserO.isPresent()) {
			appUser = appUserO.get();
		}else {
			
		}
		appUserResponse = AppUserToAppUserResponse(appUser);
		return null;
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
