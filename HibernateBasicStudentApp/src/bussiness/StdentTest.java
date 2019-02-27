package bussiness;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class StdentTest {

	public static void main(String[] args) {
		System.out.println("Sucessfull Saved");
		Student s=new Student();
		
		s.setSid(129);
		s.setsName("Naveen");
		s.setGrade('A');
		s.setEmail("naeenvemula.666@gmail.com");
		s.setMarks(99);
		s.setAddress("Tadiptri");
		Configuration c=new Configuration();
		c.configure("resources/hibernate.cfg.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		se.save(s);
		se.beginTransaction().commit();		
		System.out.println("Sucessfull Saved");
	se.evict(s);	
	}

}
