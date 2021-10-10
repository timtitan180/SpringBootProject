package perscholas.security;

import java.security.Permission;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import perscholas.database.entities.User;
import perscholas.database.entities.UserRole;
import perscholas.database.daos.UserDao;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	static final Logger LOG = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Override

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userDao.findByEmail(email);

		if (user == null) {
			throw new UsernameNotFoundException("Username" + email + "" + "could not be found");
		}

		List<UserRole> userRoles = userDao.getUserRoles(user.getId());

		boolean accountIsEnabled = true;
		// accountIsEnabled = user.isActive();
		// spring security configs
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		java.util.Collection<? extends GrantedAuthority> springRoles = getAuthority(userRoles);

		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				accountIsEnabled, accountNonExpired, credentialsNonExpired, accountNonLocked, springRoles);
	}

	private List<GrantedAuthority> getAuthority(List<UserRole> userRoles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (UserRole role : userRoles) {
			authorities.add(new SimpleGrantedAuthority(role.getRole().toString()));
		}

//////	// always add the user role
		authorities.add(new SimpleGrantedAuthority("USER"));
		return authorities;
	}
}