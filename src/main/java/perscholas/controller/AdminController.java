package perscholas.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin")
@PreAuthorize("HasAuthoruty('ADMIN)")
public class AdminController {
	@RequestMapping("/protected")
	public ModelAndView slash() {
		ModelAndView response = new ModelAndView();
		response.setViewName("admin/protected");
		return response;
	}
}
