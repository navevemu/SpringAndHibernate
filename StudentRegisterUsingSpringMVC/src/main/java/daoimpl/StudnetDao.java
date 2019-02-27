package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.context.support.XmlWebApplicationContext;

import model.Student;



public class StudnetDao {
	
	DataSource datasource;
	public  StudnetDao()
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		datasource=(DataSource) app.getBean("ds");
		System.out.println(datasource);
		
	}
				

	
	public List<Student> search( String name) throws SQLException {
		
		Connection con=datasource.getConnection();
		PreparedStatement pt=con.prepareStatement("select * from Studentregister where sName=?");
		pt.setString(1, name);
		
	ResultSet rs=pt.executeQuery();
	List<Student> ls=new ArrayList<Student>();
	while(rs.next())
	{
		Student s=new Student();
		s.setSid(rs.getInt(1));
		s.setSname(rs.getString(2));
		s.setMobno(rs.getLong("mobno"));
		s.setEmail(rs.getString("email"));
		ls.add(s);
		
		
	}
		
		return ls;
		
		
	}
}
