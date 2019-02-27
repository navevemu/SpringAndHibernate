package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Employee;

public class AllRecordsTest {

	public static void main(String[] args) {
	Configuration con=new Configuration();
	con.configure("resources/employee.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	Criteria c=s.createCriteria(Employee.class);
	List<Employee> l=c.list();
	for(Employee e:l)
		System.out.println(e);
	

	}

}
