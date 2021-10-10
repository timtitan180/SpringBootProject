//package perscholas.controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import perscholas.database.daos.StatsDao;
//import perscholas.database.entities.Stats;
//import perscholas.forms.PlayerForm;
//
//import org.springframework.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class PlayerController {
//	
//	@Autowired
//	StatsDao statsDao;
//	
//	@GetMapping(value="/createplayer")
//	public ModelAndView getPlayerTable() {
//		ModelAndView result = new ModelAndView("createPlayer");
//		return result;
//	}
//	
//	@PostMapping(value="/createplayer")
//	public ModelAndView postPlayerTable(@RequestParam String name, PlayerForm form) {
//		ModelAndView result = new ModelAndView("createPlayer");
//		Stats stats = StatsDao.getStatsByName(name);
//		
//		return result;
//		
//	}
//}
