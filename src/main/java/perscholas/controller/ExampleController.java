//package perscholas.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import perscholas.CreateUser;
//
//@Controller
//public class ExampleController {
//
//	@RequestMapping(value = "/index/{name}", method = RequestMethod.GET) //
//	public ModelAndView slashGet(@PathVariable String name, HttpServletRequest request, HttpServletResponse response) { 
//		ModelAndView result = new ModelAndView("index");
//		result.addObject("name", name);
//
//		return result;
//	}
//	
//	@RequestMapping(value = "/index/{name}", method = RequestMethod.POST) //
//	public ModelAndView slashPost(@PathVariable String name, HttpServletRequest request, HttpServletResponse response) { 
//		ModelAndView result = new ModelAndView("index");
//		String Name = request.getParameter("name");
//		String password = request.getParameter("password");
//		System.out.println("Name:"+Name+"Password:"+password);
//
//		return result;
//	}
//}

//	@RequestMapping(value="/login",method=RequestMethod.GET)
//	public ModelAndView String getUser(@RequestParam User name, @RequestParam User password) {
//		return "User";
//	}

//	@RequestMapping(value = "/index", method = RequestMethod.POST)
//	public ModelAndView slashPost(@RequestParam String name, @RequestParam(required = true) Integer id,
//			HttpServletRequest request, HttpServletResponse response) {
//
//		ModelAndView result = new ModelAndView("index");
//
//		result.addObject("name", name);
//		result.addObject("id", id);
////		result.addObject("password", password);
//
//		return result;
//	}
