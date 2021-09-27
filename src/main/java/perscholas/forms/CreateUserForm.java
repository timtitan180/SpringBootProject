package perscholas.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CreateUserForm {
	@NotEmpty(message = "Please enter your first name")
	@Pattern(regexp="^[A-Z][a-z]{5}",message="Please enter your first name 5 min. characters needed")
	private String firstName;
	@NotEmpty(message = "Please enter your last name")
	@Pattern(regexp="^[A-Z][a-z]{5}",message="Please enter your first name 5 min. characters needed")
	private String lastName;
	@NotEmpty(message = "Please enter your email")
	@Pattern(regexp="^[A-Z0-9+_.-]+@[A-Z0-9.-]+$",message="Please enter an actual email")
	private String email;
	@NotEmpty(message = "Please enter your password")
	@Pattern(regexp="^[A-Z0-9]",message="Please enter your password")
	private String password;
	@NotEmpty(message = "Please enter your password again")
	private String confirmPassword;




	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@Override
	public String toString() {
		return "CreateUserForm: [" + firstName + "" + lastName + "" + email + "" +password + "" + confirmPassword
				+ "]";
	}


}
