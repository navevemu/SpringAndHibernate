package com.springcore.DatabaseConnectionTest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:192.168.0.103:1521:orcl","naveen","naveen");
		
System.out.println(con);
Statement st =con.createStatement();
ResultSet r=st.executeQuery("select * from student");

while(r.next())
System.out.println(r.getObject(2));
	}

}
