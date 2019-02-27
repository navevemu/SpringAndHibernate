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
import javax.servlet.http.HttpSession;

public class AdharReg extends HttpServlet{
	int adharregno=100;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs=req.getSession();
		String hiddenvalue=req.getParameter("form");
		if(hiddenvalue.equals("1")){
			String fname=req.getParameter("fname");
			String mname=req.getParameter("mname");
			String lname=req.getParameter("Lname");
			
			hs.setAttribute("fname", fname);
			hs.setAttribute("mname", mname);
			hs.setAttribute("lname", lname);
			resp.sendRedirect("./form2.html");
		}
		 if (hiddenvalue.equals("2")) {
			
			hs.setAttribute("age", req.getParameter("age"));
			hs.setAttribute("sex", req.getParameter("sex"));
			hs.setAttribute("fathername", req.getParameter("fathername"));
			resp.sendRedirect("./form3.html");
			
		}
		 if (hiddenvalue.equals("3")) {
			hs.setAttribute("add", req.getParameter("add"));
			hs.setAttribute("occ", req.getParameter("occ"));
			String fname=(String) hs.getAttribute("fname");
			String mname=(String) hs.getAttribute("mname");
			String lname=(String) hs.getAttribute("lname");
			String age=(String) hs.getAttribute("age");
			String fathername=(String) hs.getAttribute("fathername");
			String sex=(String) hs.getAttribute("sex");
			String occ=(String) hs.getAttribute("occ");
			String add=(String) hs.getAttribute("add");
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","naveen","naveen");
				PreparedStatement ps=con.prepareStatement("insert into AdharReg values(?,?,?,?,?,?,?,?,?)");
				ps.setInt(1,adharregno);
				ps.setString(2,fname);
				ps.setString(3,mname);
				ps.setString(4,lname);
				
				ps.setString(5,fathername);
				ps.setString(6,sex);
				ps.setString(7,occ);
				ps.setString(8,age);
				ps.setString(9,add);
				int i=ps.executeUpdate();
				PrintWriter pw=resp.getWriter();
				if(i>0)
					pw.println("Registartion Sucess");
				else
					pw.println("Registartion fail");
				
			}catch (Exception e) {
				e.printStackTrace();
		}
		 
		 
		
	}}}
	
	
	
	
	

