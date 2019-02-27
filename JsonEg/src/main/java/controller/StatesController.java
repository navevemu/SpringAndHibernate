package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import Dao.StatesDao;

@Controller

public class StatesController {
	StatesDao sd=new StatesDao();
	@RequestMapping(value="pages/display1.html",method=RequestMethod.GET)
	@ResponseBody
	public String getData(HttpServletRequest req,HttpServletResponse response) {
		
		
		
	System.out.println("In controllle" +req.getParameter("cName"));
		Gson g=new Gson();
		String json=g.toJson(sd.getStatesByCountry(req.getParameter("cName")));
		/*ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject("records", json);*/
		//m.addAttribute("records",json);
		return json;
	}

}
