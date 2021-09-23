package perscholas.entities;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	
	@Column(name="fullname")
	private String FullName;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="password")
	private String Password;

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "User: [" + getFullName() + "" + getEmail() + "" + getPassword() + "]";
	}

}
