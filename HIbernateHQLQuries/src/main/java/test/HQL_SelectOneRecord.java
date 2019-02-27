package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import beans.Student;

public class HQL_SelectOneRecord {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql=" from Student where id=100";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	Object o=q.uniqueResult();
	Student st=(Student)o;
	
	System.out.println("Details of Student");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(st);
	
	}

}
