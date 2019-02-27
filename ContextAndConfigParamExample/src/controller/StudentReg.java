package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentReg extends GenericServlet{
	Connection con;
	int pk=100;
@Override
public void init(ServletConfig config) throws ServletException {
	ServletContext sxct=config.getServletContext();
	String driver=sxct.getInitParameter("driver");
	String url=sxct.getInitParameter("url");
	String username=config.getInitParameter("user_name");
	String password=config.getInitParameter("password");
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
}
@Override
	public void destroy() {
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		PrintWriter pw=arg1.getWriter();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into StudentReg values(?,?,?,?)");
			ps.setInt(1,pk);
			ps.setString(2, arg0.getParameter("sname"));
			ps.setString(3,arg0.getParameter("mobno"));
			ps.setString(4,arg0.getParameter("course"));
			int i=ps.executeUpdate();
			if(i>0)
			{
				pw.println("<font color='green'>Student Registration Successfull</font>");
				pk=pk+1;
			}
			else{
				pw.println("Invalid records registration failure");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
