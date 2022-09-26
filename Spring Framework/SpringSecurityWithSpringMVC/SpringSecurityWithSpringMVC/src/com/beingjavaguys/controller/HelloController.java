package com.beingjavaguys.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcomePage")
public class HelloController {
 
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Welcome to your first Spring Security Example");
		return "Welcome";
 
	}
 
}