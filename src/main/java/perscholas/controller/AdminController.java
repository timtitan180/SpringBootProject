package perscholas.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/login")
@PreAuthorize("HasAuthoruty('ADMIN)")
public class AdminController {
	@GetMapping("/admin")
	public ModelAndView getAdminPage() {
		ModelAndView adminPage = new ModelAndView("adminpage");
		return adminPage;
	}
}
