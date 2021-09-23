package perscholas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/games")
public class GameController {
	@RequestMapping(value="gameTable",method=RequestMethod.GET)
	public ModelAndView getGamesTable() {
		ModelAndView result = new ModelAndView("gamesTable");
		return result;
	}
}
