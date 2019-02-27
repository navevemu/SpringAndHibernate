package controller;

	import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  
	@Controller  
	public class HelloController {  
	@RequestMapping("/hello")  
	    public String redirect(HttpServletRequest req,Model m)  
	    
	    {
		String name=req.getParameter("sname");
		m.addAttribute("msg", "Hello"+name);
	        return "viewpage";  
	    }     
	@RequestMapping("/helloagain")  
	public String display()  
	{  
	    return "final";  
	}  
	

}
