package com.getinputs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/home")
	public String getHomePage(Model model) {
		
		model.addAttribute("name", "Suraj");
		
		return "home-page";
	}
}
