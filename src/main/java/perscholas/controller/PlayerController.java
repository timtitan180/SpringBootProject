package perscholas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import perscholas.User;
@Controller
public class PlayerController {

	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		ModelAndView result = new ModelAndView("playersTable");
		return result;
	}


}

