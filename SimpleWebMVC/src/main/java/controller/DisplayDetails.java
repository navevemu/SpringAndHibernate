package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayDetails {
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView viewDetails(@PathVariable Map<String,String> vars)
	{

		ModelAndView mv=new ModelAndView("msg");
		mv.addObject("msg","Hi "+vars.get("userName")+"You are from  "+ vars.get("countryName"));
		return mv;
	}

	
}
