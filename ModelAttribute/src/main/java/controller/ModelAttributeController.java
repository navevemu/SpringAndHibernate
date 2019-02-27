package controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import model.Student;

@Controller
public class ModelAttributeController {
	@RequestMapping(value="/admission")
	public ModelAndView getAdmissionForm() {
		
		String exception="NullPointer";
		if(exception.equals("NullPointer"))
		{
			throw new NullPointerException();
		}
		ModelAndView mv=new ModelAndView("admissionform");
		mv.addObject("msg","Please fill the details");
		return mv;
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e)
	{
		return "exception";
	}
	@InitBinder
	public void initbinder(WebDataBinder wbd)
	
	{
	wbd.setDisallowedFields(new String[]{"mobno"});	
	wbd.registerCustomEditor(String.class,"sname",new StudentNameEditor());
	
	}
	
	
	@ModelAttribute
	public void addCommonObjects(Model m)
	{
	m.addAttribute("headermsg","JNTUA college of Engineering");	
	}
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public ModelAndView createAdmission(@Valid@ModelAttribute("student1") Student student1 ,BindingResult br) {
		
		if(br.hasErrors())
		{
			ModelAndView mv=new ModelAndView("admissionform");
			mv.addObject("msg","Please fill the details");
			return mv;
		}
		ModelAndView mv=new ModelAndView("register");
		mv.addObject("msg","Registration Success");
		return mv;
	}

	
	
}
