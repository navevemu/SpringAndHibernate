package test;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HQL_Update {

	public static void main(String[] args) {
	
		Configuration c=new Configuration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql="update Student set id=100,email='naveen@gmail.com' where id=123";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	int i=q.executeUpdate();
	System.out.println("No.of rows updated"+i);
	s.beginTransaction().commit();
	
	}

}
