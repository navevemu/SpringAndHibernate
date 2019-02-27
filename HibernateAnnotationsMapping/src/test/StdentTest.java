package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class StdentTest {

	public static void main(String[] args) {
		
		Student s=new Student(100, "naveen", "naveen@gmail.com", 99);
		
		s.setCollegeName("Narayana Engineering Colloge");
		Configuration c=new AnnotationConfiguration();
		c.configure("resources/student.cgf.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		se.save(s);
		se.beginTransaction().commit();		
		System.out.println("Sucessfull Saved");
	se.evict(s);	
	}

}
