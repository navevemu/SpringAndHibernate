package bussiness;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class DeleteTest {

	public static void main(String[] args) {
		
Student s=new Student();
		
		s.setSid(100);
		
		Configuration c=new Configuration();
		c.configure("resources/hibernate.cfg.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		
	 se.delete(s);
		Transaction t=se.beginTransaction();
		t.commit();
		System.out.println("Sucessfully deleted");
	
	
	}

	}


