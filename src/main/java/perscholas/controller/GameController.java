package perscholas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GameController {
	@GetMapping(value="/createGame")
	public ModelAndView getGamesTable() {
		ModelAndView result = new ModelAndView("createGames");
		return result;
	}
	
	@PostMapping(value="/createGame")
	public ModelAndView postGamesTable() {
		ModelAndView result = new ModelAndView("createGames");
		return result;
	}
}
