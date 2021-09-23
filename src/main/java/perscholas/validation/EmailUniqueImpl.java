package perscholas.validation;

import java.lang.System.Logger;

import javax.validation.ConstraintValidator;
import perscholas.daos.UserDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
public class EmailUniqueImpl implements ConstraintValidator<EmailUnique,String> {
	public static final Log LOGGER = LoggerFactory.getLogger(EmailUniqueImpl.class);

	
	@Autowired 
	private UserDAO userDao;
	
	
	
}
