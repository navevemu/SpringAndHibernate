package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class RestrictionsGtTest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("resources/employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Criteria c=s.createCriteria(Employee.class);
		Criterion  cr=Restrictions.gt("salary",80000);
		c.add(cr);
		List<Employee> l=c.list();
		
		for(Employee e:l)
			System.out.println(e);
		


	}

}
