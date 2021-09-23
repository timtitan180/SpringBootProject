package perscholas.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import javax.validation.constraints.Valid;
import perscholas.CreateUser;

public class UserController {

	// create mapping for user sign up
	// create user
	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
	public ModelAndView createUser() {
		ModelAndView user = new ModelAndView("login");
		user.addObject("user", new CreateUser());
		return user;
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ModelAndView createUserSubmit(CreateUser user, BindingResult bindingResult) {
		ModelAndView result = new ModelAndView("signup");
		for (FieldError error : bindingResult.getFieldErrors()) {
			System.out.println("Errors:" + error.getField() + "=" + error.getDefaultMessage());
		}

		return result;
	}
}
