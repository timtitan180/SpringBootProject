package perscholas.database.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import perscholas.database.entities.User;

public interface LoginDao extends JpaRepository<User,Long> {
 public User findByPassword(@Param("password") String password);
}
