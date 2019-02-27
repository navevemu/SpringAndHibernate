package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class StdentTest {

	public static void main(String[] args) {
		Student s=new Student();
		
		s.setSid(103);
		s.setsName("Venu");
		s.setGrade('A');
		s.setEmail("Venu666@gmail.com");
		s.setMarks(97);
		s.setAddress("Nellore");
		Configuration c=new Configuration();
		c.configure("resources/hibernate.cgf.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		se.save(s);
		se.beginTransaction().commit();		
		System.out.println("Sucessfull Saved");
	se.evict(s);	
	}

}
