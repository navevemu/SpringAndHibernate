package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCyleMethodsTest implements Servlet {

	@Override
	public void destroy() {
		System.out.println("At the time shutdowning application");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("After creation of servlet object");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("At user request service methd will excute");
	}
public ServletLifeCyleMethodsTest() {
	System.out.println("Object Created ");
}
}