package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	
	@RequestMapping("/request")
	public ModelAndView request()
	{
		ModelAndView mv=new ModelAndView("msg");
		mv.addObject("msg","Hi Naveen Welcome to Spring MVC");
		return mv;
		
	}

}
