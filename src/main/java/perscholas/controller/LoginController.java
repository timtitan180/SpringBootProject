package perscholas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import perscholas.database.daos.LoginDao;
import perscholas.database.entities.User;
import perscholas.forms.LoginForm;

@org.springframework.stereotype.Controller


public class LoginController{
	@Autowired
	LoginDao loginDao;
	
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
		if(!loginDao.exists(Example.of(user))) {
			view.addObject("error", "User could not be found in our system. Check your username and password");
			return view;
		}
		else {
			view.setViewName("redirect:/adminDashboard");
			return view;
		}
	}
}
