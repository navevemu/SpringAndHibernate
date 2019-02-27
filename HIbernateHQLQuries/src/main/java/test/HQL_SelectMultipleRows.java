package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import beans.Student;

public class HQL_SelectMultipleRows {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql=" from Student";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	List<Object> l=q.list();
for (Object object : l) {
	Student st=(Student)object;
	System.out.println("Details of Student");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(st);
}
	
	
	
	
	}

}
