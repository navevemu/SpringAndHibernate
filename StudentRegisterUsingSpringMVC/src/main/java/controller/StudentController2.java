package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import bussiness.StudentBussiness;
import model.Student;



@Controller
public class StudentController2 {
	
	Student st=new Student();
	StudentBussiness sb=new StudentBussiness();
	@RequestMapping(value="StudentRegisterUsingSpringMVC/search")
	public ModelAndView search(@PathVariable("name") String studentName)
	{
		List<Student> students=sb.searchByName(studentName);
		ModelAndView mv=new ModelAndView("hello");
		mv.addObject("StudentList",students.toString());
		System.out.println("in controller");
		return mv;
	}

}
