package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class ProjectionOneColumn {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("resources/employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Criteria c=s.createCriteria(Employee.class);
		PropertyProjection p= Projections.property("ename");
		c.setProjection(p);
		List<String> l=c.list();
		
		for(String e:l)
			System.out.println(e);
		



	}

}
