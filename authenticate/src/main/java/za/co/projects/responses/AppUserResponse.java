package za.co.projects.responses;

import org.springframework.stereotype.Component;

@Component
public class AppUserResponse {
	
	private Long id;
	private String username;
	private String password;
	private String email;
	private String role;
	
	public AppUserResponse(Long id, String username, String password, String email, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public AppUserResponse() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AppUserResponse [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", role=" + role + "]";
	}
	
	

}//------------------------------------
