package za.co.projects.services;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import za.co.projects.responses.AppUserResponse;

@SpringBootTest
class AppUserServiceTest {
	
	@Autowired
	private AppUserService appUserService;

	@Test
	void testGetAllAppUsersMockito() {
		AppUserService appUserService = Mockito.mock(AppUserService.class);
		List<AppUserResponse> appUserResponse = new ArrayList<>();
		appUserResponse.add(new AppUserResponse(1L,"tlavu","Password1","admin@amin.com","admin"));
		Mockito.when(appUserService.getAllAppUsers()).thenReturn(appUserResponse);	
	}
	
	@Test
	void testGetAllAppUsers() {
		List<AppUserResponse> appUserResponse = appUserService.getAllAppUsers();
		assertTrue(!appUserResponse.isEmpty());
		
	}

}
