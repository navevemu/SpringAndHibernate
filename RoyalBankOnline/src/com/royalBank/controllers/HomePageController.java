package com.royalBank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	@RequestMapping(value="/home")
	public ModelAndView requestHomePage()
	{
		System.out.println("request received");
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@RequestMapping(value="/register")
	public ModelAndView registerPage() {
		
			ModelAndView mv=new ModelAndView("accountCreation");
			return mv;
		
		
	}
}
