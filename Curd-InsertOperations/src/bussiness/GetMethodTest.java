package bussiness;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class GetMethodTest {

	public static void main(String[] args) {
		

		Configuration c=new Configuration();
		c.configure("resources/hibernate.cfg.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		Student s2=(Student) se.get(Student.class,101);	

		
		System.out.println(s2);
	
	
	}

	}


