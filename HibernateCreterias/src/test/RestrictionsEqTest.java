package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class RestrictionsEqTest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("resources/employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Criteria c=s.createCriteria(Employee.class);
		Criterion  cr=Restrictions.eq("ename","naveen");
		c.add(Restrictions.eq("empid",100));
		c.add(cr);
		List<Employee> l= c.list();
		System.out.println(l.isEmpty());
		for(Employee e:l) {
			System.out.println(e);
		}


	}

}
