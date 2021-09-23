

import javax.validation.constraints.NotEmpty;

public class CreateUser {

	@NotEmpty(message = "Password must be at least 12 characters long")
	private String FullName;

	@NotEmpty(message = "Must include an email")
	private String Email;

	@NotEmpty(message = "Password must be at least 10 characters long and must include at least one number")
	private String Password;

	public void setFullName(String FullName) {
		this.FullName = FullName;
	}

	public String getFullName() {
		return FullName;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getPassword() {
		return Password;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getEmail() {
		return Email;
	}

}
