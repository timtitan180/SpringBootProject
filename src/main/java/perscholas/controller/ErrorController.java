package perscholas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class ErrorController {
	@ExceptionHandler(Exception.class)
	public void handleAllExceptions(Exception ex) {
		ex.printStackTrace();
	}
}
