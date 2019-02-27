package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussiness.StudentBussiness;
import entities.Student;

public class StudentSearch extends HttpServlet{
	Student st=new Student();
	StudentBussiness sb=new StudentBussiness();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter p=res.getWriter();
		p.println(sb.searchByName(req.getParameter("name1")));
		
	}
	
}
