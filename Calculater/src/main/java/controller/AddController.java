package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddController {
Employee e;

	public Employee getE() {
	return e;
}

public void setE(Employee e) {
	this.e = e;
}

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res)
	{
	String i=req.getParameter("n1");
	//int j=Integer.parseInt(req.getParameter("n2"));
	//int k=i+j;
	System.out.println(i);
	ModelAndView mv=new ModelAndView();
	mv.setViewName("index.jsp");
	mv.addObject("result", e.toString());
	
	return mv;
	

	
	
}
}
