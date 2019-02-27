package test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


import beans.Student;

public class StdentTest {

	public static void main(String[] args) {
		System.out.println("Sucessfull Saved");
		Student s=new Student();
		
		s.setSid(1000);
		s.setsName("");
		
		s.setEmail("naeenvemula.666");
		s.setMarks(99);
		
		Configuration c=new AnnotationConfiguration();
		c.configure("resources/student.cgf.xml");
		ValidatorFactory vf=Validation.buildDefaultValidatorFactory();
		Validator v=vf.getValidator();
		Set<ConstraintViolation<Student>> err=v.validate(s);
		SessionFactory sf= c.buildSessionFactory();
		Session se=sf.openSession();
		if(!err.isEmpty())
		{
			for(ConstraintViolation<Student> cv:err)
			{
				System.out.println(cv.getPropertyPath()+"    "+cv.getMessage());
			}
		}
		else{
		se.save(s);
		se.beginTransaction().commit();		
		System.out.println("Sucessfull Saved");
	se.evict(s);
		}
	}

}
