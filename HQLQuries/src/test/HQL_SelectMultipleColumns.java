package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class HQL_SelectMultipleColumns {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql=" select sid,sName,email from Student";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	List<Object[]> l=q.list();
for (Object object : l) {
	Object ar[]=(Object[])object;
	
	System.out.println("Details of Student");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	}

	}
}
