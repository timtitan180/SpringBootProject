package perscholas.database.services;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import perscholas.database.daos.UserDao;
import perscholas.database.entities.User;

@Service
public class UserServiceImpl implements UserDao {
	@Override
	public findById(@Param("id") Integer Id);
	
	@Override
	public findByEmail(@Param("email") String Email);
	
}
