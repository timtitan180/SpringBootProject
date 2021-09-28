package perscholas.database.entities;

import javax.persistence.*;

@Entity
@Table(name="user_role")
//@OneToMany()
public class UserRole {
	@Basic(fetch=FetchType.LAZY)
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private List<UserRole> = new ArrayList<UserRole>();
	
	@OneToMany()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private Integer Id;
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="user_role")
	private String userRole;
}
