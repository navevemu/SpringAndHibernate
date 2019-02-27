package bussiness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import beans.Student;

public class StudentDaoimpl  implements StudentDao{
private Connection c;
private Student s;
private String driver,url,user,password;


	public Student getS() {
	return s;
}

public void setS(Student s) {
	this.s = s;
}

public String getDriver() {
	return driver;
}

public void setDriver(String driver) {
	this.driver = driver;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	@Override
	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		c=DriverManager.getConnection(url, user, password);
		System.out.println("connection opened");
			}

	@Override
	public void destroy() throws Exception {
		
		c.close();
		System.out.println("connection closed");
	}

	@Override
	public void save()  {
		try{
		PreparedStatement p=c.prepareStatement("insert into student values(?,?,?,?)");
		p.setInt(1, s.getRollno());
p.setString(2, s.getName());
p.setString(3, s.getBranch());
p.setInt(4, s.getTotal());
p.executeUpdate();
System.out.println("insertion done");
		}
		catch (Exception e) {
			System.out.println("insertion Failed");
			e.printStackTrace();
		}
		
	}

}
