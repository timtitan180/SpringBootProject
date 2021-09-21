package perscholas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import perscholas.User;
@Controller
public class LoginController {
	User user = new User();

	@RequestMapping(value = "/login/", method = RequestMethod.GET)
	public ModelAndView getLogin(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView result = new ModelAndView("login");
		return result;
	}

	@RequestMapping(value = "/login/", method = RequestMethod.POST)
	public ModelAndView getPostLogin(@RequestParam String name, @RequestParam String password,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView result = new ModelAndView("login");
		HttpSession session;
		try {
			session = HttpServletRequest.getSession();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String inputtedName = request.getParameter("name");
		String inputtedPassword = request.getParameter("password");
		session.setAttribute("name", inputtedName);
		session.setAttribute("password", inputtedPassword);
		user.setName(inputtedName);
		user.setPassword(inputtedPassword);
		session.getAttribute("name");
		session.getAttribute("password");
	
		// bring in user object
		// check the inputs from the form in the login jps
		// if the inputs do not match the example strings redirect them to an error jsp
		// page
		//

		return result;
	}
}
