package perscholas.daos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.FieldError;
import java.util.ArrayList;
import java.util.List;
import perscholas.entities.User;

public interface UserDao {
	public User findById(@Param("id") Integer id);

	public User findByEmail(@Param("email") String Email);

	@Query(value = "INSERT INTO User u(fullname,email,password) VALUES (:name,:email,:password)")
	public User save();

	List<String> errors = new ArrayList<String>();
	
	for(

	FieldError error:bindingResult.getFieldErrors())
	{
		System.out.println(error.getField() + "=" + error.getDefaultMessage());
	}
}