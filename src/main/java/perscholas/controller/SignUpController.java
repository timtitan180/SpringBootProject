package perscholas.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;
import javax.validation.Valid;
import javax.validation.constraints.*;
import perscholas.CreateUser;
import perscholas.entities.User;
import perscholas.daos.*;
import java.util.*;

@Controller
public class SignUpController {

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public ModelAndView getSuccessPage() {
		ModelAndView page = new ModelAndView("success");
		return page;
	}

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

	@RequestMapping(value = "/loginuser", method = RequestMethod.GET)
	public ModelAndView GetLoginUser(Model model) {
		ModelAndView loginPage = new ModelAndView("login");
		return loginPage;

	}

	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	public ModelAndView PostLoginUser(@RequestParam String name, @RequestParam String email,
			@RequestParam String password, @Valid CreateUser newUser) {
		ModelAndView postLoginPage = new ModelAndView("login");
		if (name != null && email != null && password != null) {

			newUser = new CreateUser();
			newUser.setName("name");
			newUser.setEmail("email");
			newUser.setPassword("password");
			System.out.println(newUser.toString());

		}
		
		if(name == "") {
			postLoginPage.addObject("message","Please enter your name!");
			postLoginPage.setViewName("redirect:/success");
		}

		// if name email and password are not null
		// the form will redirect to a different page and the data will be saved in a
		// user model from the perscholas entities

		// write a conditional to check if the values of the input form are null
		// if they are not redirect to the success page
		// save the inputs into the setters of the createUser object then save that data
		// into the database entity
		return postLoginPage;

	}

	// need to get fullname,email and password from the form in the login jsp
	// I need to create a session and get the attributes of name email and password
	// from the getters of the Users bean
//		request.getAttribute("name");
//		request.getAttribute("password");

}
