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
		//sf.close();
		Session s=sf.openSession();
		Student st=new Student();
	//	st.setId(100);st.setSname("Naveen");st.setCourse("Java,Spring,Hibernate");
			//move to persistance state
		//s.update(st);
		//System.out.println("Insertion sucess");
		//move to database state
		//s.beginTransaction().commit();
		//remove from persisitance state
		//s.evict(st);
		//System.out.println(s.save(st));
		//System.out.println(s.get(Student.class, 100));
	Student stu=s.load(Student.class, 888);
		System.out.println(stu.getId());
		System.out.println(stu.getCourse());
		s.close();sf.close();
	}

}
