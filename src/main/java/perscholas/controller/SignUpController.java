package perscholas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import perscholas.database.daos.UserDao;
import perscholas.database.entities.User;
import perscholas.forms.CreateUserForm;

@Controller
public class SignUpController {

@Autowired
UserDao userDao;

@Autowired
PasswordEncoder passwordEncoder;

	@GetMapping(value = "/signup")
	public ModelAndView GetLoginUser() {
		ModelAndView signupPage = new ModelAndView("signup");
		signupPage.addObject("form", new CreateUserForm());
		return signupPage;

	}

	@PostMapping(value = "/signup")
	public ModelAndView PostLoginUser(@Valid CreateUserForm form, BindingResult bindingResult) {

		ModelAndView postSignupPage = new ModelAndView("signup");
		postSignupPage.addObject("form", form);
		List<String> errors = new ArrayList<String>();

		for (FieldError error : bindingResult.getFieldErrors()) {
			System.out.println("Error:" + "=" + error.getField());
			errors.add(error.getDefaultMessage());
		}

		postSignupPage.addObject("errors", errors);

		if (errors.size() > 0) {
			return postSignupPage;
		}

		// business logic
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setFirstName(form.getFirstName());
		user.setLastName(form.getLastName());
		user.setEmail(form.getEmail());
		user.setPassword(passwordEncoder.encode(form.getPassword()));

//		userDao.save(user);
		users.add(user);

		return postSignupPage;

	}

}

// need to get fullname,email and password from the form in the login jsp
// I need to create a session and get the attributes of name email and password
// from the getters of the Users bean
//		request.getAttribute("name");
//		request.getAttribute("password");

//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) {
//		ModelAndView result = new ModelAndView("login");
//		return result;
//	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView getPostLogin(@RequestParam String name, @RequestParam String email,@RequestParam String password, HttpServletRequest request, HttpServletResponse response,
//			HttpSession session) {
//		ModelAndView result = new ModelAndView();
//		Users user = new Users();
//		if(name != null) {
//			result.addObject("name");
//			result.addObject("password");
//			result.addObject("email");
//		}
//
//		if(!"tom".equals(session.getAttribute("name")) || !"john".equals(session.getAttribute("password")) || !"ryan@gmail.com".equals("email")){
//			result.addObject("message","Please enter your information");
//			return result;
//		}
//		else {
//			result.setViewName("redirect:/success");
//			result.addObject("name", session.getAttribute("name"));
//			result.addObject("password", session.getAttribute("password"));
//
//		}
//		return result;
//	}
