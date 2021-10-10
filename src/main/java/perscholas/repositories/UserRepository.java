package perscholas.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import perscholas.database.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	public User findByUsername(String email);
	
	public User findById(Integer id);
}
