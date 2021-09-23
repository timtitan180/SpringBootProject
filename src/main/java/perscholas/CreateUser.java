package perscholas;

import javax.validation.constraints.NotEmpty;

public class CreateUser {
	@NotEmpty(message="Please enter a name")
	String name;
	
	@NotEmpty(message="Please enter your password")
	String password;
	@NotEmpty(message="Please enter your email")
	String email;
	
	public CreateUser() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public String toString() {
		return "User: [" + "" + name + "" + email + "" + "" + password + "" + "]";
	}
	
}
