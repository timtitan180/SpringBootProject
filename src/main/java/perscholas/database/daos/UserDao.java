package perscholas.database.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.FieldError;
import java.util.ArrayList;
import java.util.List;
import perscholas.database.entities.User;
import perscholas.database.entities.UserRole;

public interface UserDao extends JpaRepository<User,Long> {
	public User findByPassword(@Param("password") String password);
	 
	public 	User findById(@Param("id") Integer id);

	@Query(value="SELECT u FROM User u WHERE u.email = :email")
	public User findByEmail(@Param("email") String email);
	
	@Query(value="SELECT u from User u")
	public List<User> getAllUsers();
	
	@Query(value="SELECT ur from UserRole ur WHERE ur.id = :id")
	List<UserRole> getUserRoles(Integer id);


}