package perscholas.database.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.FieldError;
import java.util.ArrayList;
import java.util.List;
import perscholas.database.entities.User;

public interface UserDao extends JpaRepository<User,Long> {
	public User findById(@Param("id") Integer Id);

	public User findByEmail(@Param("email") String Email);
	

}