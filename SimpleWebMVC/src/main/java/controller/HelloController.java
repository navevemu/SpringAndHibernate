package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/handle")
public class HelloController {
	@RequestMapping("/service")
	public ModelAndView service()
	{
		ModelAndView mv=new ModelAndView("msg");
		mv.addObject("msg","Hi Naveen Welcome to Spring MVC");
		return mv;
		
	}
	@RequestMapping("/service2")
	public ModelAndView service2()
	{
		ModelAndView mv=new ModelAndView("msg");
		mv.addObject("msg","Hi Welcome to Spring MVC");
		return mv;
		
	}

}
