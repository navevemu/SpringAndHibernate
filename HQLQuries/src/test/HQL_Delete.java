package test;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HQL_Delete {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql="Delete from Student where id=101";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	int i=q.executeUpdate();
	System.out.println("No.of rows deleted"+i);
	s.beginTransaction().commit();
	
	}

}
