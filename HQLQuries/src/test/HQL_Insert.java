package test;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HQL_Insert {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("/resources/hibernate.cgf.xml");
		SessionFactory sf=c.buildSessionFactory();
		String hql="insert into Student(sid,sName,grade,email,marks,address) select sid,sName,grade,email,marks,address from Student001";
	Session s=sf.openSession();
	Query q=s.createQuery(hql);
	
	int i=q.executeUpdate();
	System.out.println("No.of rows dumped"+i);
	s.beginTransaction().commit();
	
	
		
		
		

	}

}
