package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String mobileno=req.getParameter("mobno");
	PrintWriter pw=resp.getWriter();
	boolean b=true;
	if(name.equals("")){
		pw.println("name is mandatory");
		b=false;
	}
if(email.equals("")){
	pw.println("email is mandatory");
	b=false;
	}
if(mobileno.equals("")){
	pw.println("mobile number is mandatory");
	b=false;
}
if(b==true)
{
	pw.println("forwarding to next");
	//ContactReg cr=(ContactReg) req.getServletContext().getServlet("ContactReg");
	//cr.doPost(req, resp);
	//RequestDispatcher rd=req.getRequestDispatcher("next");
	//rd.forward(req, resp);
	//rd.include(req, resp);
	RequestDispatcher rd=getServletContext().getNamedDispatcher("controller.ContactReg");
	rd.forward(req, resp);
}

}
}
