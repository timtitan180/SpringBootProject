package perscholas.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import perscholas.forms.PlayerForm;

import org.springframework.*;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {
	@GetMapping(value="/createplayer")
	public ModelAndView getPlayerTable() {
		ModelAndView result = new ModelAndView("createPlayer");
		return result;
	}
	
	@PostMapping(value="/createplayer")
	public ModelAndView postPlayerTable(PlayerForm form) {
		ModelAndView result = new ModelAndView("createPlayer");
		
		
		return result;
		
	}
}
