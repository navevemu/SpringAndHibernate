package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactReg extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String mobileno=req.getParameter("mobno");
	PrintWriter pw=resp.getWriter();
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","naveen","naveen");
		PreparedStatement ps=con.prepareStatement("insert into contactdtls values(?,?,?)");
	ps.setString(1, name);
	ps.setString(2, email);
	ps.setString(3, mobileno);
	int i=ps.executeUpdate();
	
	if(i>0)
		pw.println("Registartion Sucess");
	else
		pw.println("Registartion fail");
	
	
	
	
	}catch (Exception e) {
		e.getMessage();
	}
}
}
