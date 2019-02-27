package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussiness.StudentBussiness;
import entities.Student;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	Student st=new Student();
	StudentBussiness sb=new StudentBussiness();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentController() {
       System.out.println("Controller object created");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println(request.getParameter("name1"));
		if(request.getParameter("name1").isEmpty()) {
		
		st.setSname(request.getParameter("name"));
	st.setEmail(request.getParameter("email"));
	//System.out.println(Long.parseLong((request.getParameter("mobno"))));
	long mobno=Long.parseLong((request.getParameter("mobno")));
	st.setMobno(mobno);
	//sb.register(st);
		response.getWriter().println("Studnet register id= "+sb.register(st));;
		
	}
	else
	{
		response.sendRedirect("search?name1="+request.getParameter("name1"));
	}
	}

}
