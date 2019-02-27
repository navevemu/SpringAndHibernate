package bussiness;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.Student;

public class UpdateTest {

	public static void main(String[] args) {
		
Student s=new Student();
		
		s.setSid(100);
		s.setsName("Naveen");
		s.setGrade('A');
		s.setEmail("naeenvemula.666@gmail.com");
		s.setMarks(99);
		s.setAddress("Tadiptri");
		Configuration c=new Configuration();
		c.configure("resources/hibernate.cfg.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		Student s2=(Student) se.get(Student.class,100);	
	 se.update(s);
		Transaction t=se.beginTransaction();
		t.commit();
		System.out.println("Sucessfull Saved");
	
	
	}

	}


