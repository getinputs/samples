package com.getinputs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScopeController {
	
	@Autowired
	RequestScopeBean requestScopeBean;
	
	@Autowired
	SessionScopeBean sessionScopeBean;
	
	@RequestMapping(value = "/checkScope")
	public String checkScope(Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		session.setMaxInactiveInterval(2);
		
		int requestCounter = requestScopeBean.getCounter();
		
		int sessionCounter = sessionScopeBean.getCounter();
		
		model.addAttribute("requestCounter", requestCounter);
		model.addAttribute("sessionCounter", sessionCounter);
		
		return "scopes";
	}
}
