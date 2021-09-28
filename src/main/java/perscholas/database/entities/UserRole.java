package perscholas.database.entities;

import javax.persistence.*;

@Entity
@Table(name="user_role")
public class UserRole {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="user_role_id")
	private Integer userRoleId;
}
