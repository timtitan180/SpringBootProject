package perscholas.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import perscholas.database.daos.UserDao;
import perscholas.database.entities.User;
import perscholas.forms.LoginForm;


@PreAuthorize("hasAuthority('ADMIN','USER')")
@Controller
public class LoginController{
	@Autowired
	UserDao userDao;
	
	@GetMapping(value="/login")
	public ModelAndView getLoginPage() {
		ModelAndView view = new ModelAndView("login");
		return view;
	}
	
	@PostMapping(value="/login")
	public ModelAndView checkLoginPage(LoginForm form) {
		ModelAndView view = new ModelAndView("login");
		List<String> loginErrors = new ArrayList<String>();
		User user = new User();
		user.setPassword(form.getPassword());
		return view;
	}
	
	@GetMapping(value="/error")
	public ModelAndView getErrorPage() {
		ModelAndView errorPage = new ModelAndView("error");
		return errorPage;
	}
	
	@GetMapping(value="/logout") 
	public ModelAndView logOut(@ModelAttribute("login")LoginForm login) {
		ModelAndView logOutView = new ModelAndView("login");
		logOutView.setViewName("redirect:/index");
		return logOutView;
	}
	
}
