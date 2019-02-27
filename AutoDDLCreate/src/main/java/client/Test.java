package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("resources/student.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		System.out.println("Schema updated");
		sf.close();
//		Session s=sf.openSession();
//		Student st=new Student();
//			//move to persistance state
//		System.out.println(s.save(st));
//		//move to database state
//		s.beginTransaction().commit();
//		//remove from persisitance state
//		s.evict(st);
	}

}
