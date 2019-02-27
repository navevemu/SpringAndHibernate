package test;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class HQL_SelectAggregateResult {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql=" select avg(marks) from Student";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	double d=(double) q.uniqueResult();
	
	
	System.out.println("avarage marks of all Students");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(d);
	
	}

}
