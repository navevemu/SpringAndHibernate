package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javafx.scene.control.Alert;

public class ValidationFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		PrintWriter pw=arg1.getWriter();
String name=arg0.getParameter("name");
String email=arg0.getParameter("email");
if(name.equals("")) {
	pw.println("name is mandatory");
}
else if (email.equals("")) {
	pw.println("email is mandatory");
}
else {
	pw.println("sending data to student sevlet");
	pw.print("<pre>");
	arg2.doFilter(arg0, arg1);
	pw.println("<back-ground color:red>");
	pw.print("<pre>");
	
}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
