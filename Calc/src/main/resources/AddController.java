package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddController {

	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res)
	{
	int i=Interger.parseInt(req.getParameter("n1"));
	int j=Interger.parseInt(req.getParameter("n2"));
	int k=i+j;
	ModelAndView mv=new ModelAndView();
	mv.setViewName("index.jsp");
	mv.addObject("result", k);
	
	return mv;
	

	
	
}
}
