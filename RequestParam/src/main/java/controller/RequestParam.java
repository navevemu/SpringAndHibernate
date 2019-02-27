package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestParam {
	
	@RequestMapping(value="/admission")
	public ModelAndView getAdmissionForm() {
		
		ModelAndView mv=new ModelAndView("admissionform");
		mv.addObject("msg","Please fill the details");
		return mv;
	}
	
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public ModelAndView createAdmission(@org.springframework.web.bind.annotation.RequestParam("sname") String str,@org.springframework.web.bind.annotation.RequestParam("mailid") String mail) {
		
		
		ModelAndView mv=new ModelAndView("register");
		mv.addObject("msg","Hi "+str+" you are succefully registered with mail id "+mail);
		return mv;
	}
	
	

}
