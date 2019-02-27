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
		Session s=sf.openSession();
		Student st=new Student();
		st.setSid(110);st.setsName("Nikitha");st.setGrade('c');st.setEmail("nikitha@gmail.com");
		st.setMarks(56);st.setAddress("Tadipatri");
		//move to persistance state
		System.out.println(s.save(st));
		//move to database state
		s.beginTransaction().commit();
		//remove from persisitance state
		s.evict(st);
	}

}
