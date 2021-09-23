package perscholas.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.*;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value="table")
public class PlayerController {
	@RequestMapping(value="player",method=RequestMethod.GET)
	public ModelAndView getPlayerTable() {
		ModelAndView result = new ModelAndView("playersTable");
		return result;
	}
}
