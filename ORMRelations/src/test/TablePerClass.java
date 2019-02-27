package test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.AdminEmployee;
import beans.HWEmployee;
import beans.SWEmployee;

public class TablePerClass {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("resources/employee.cfg.xml");
		SWEmployee sw=new SWEmployee(100,"Naveen", "Naveenroyal.666@gmail.com",82000, "java");
		HWEmployee hw=new HWEmployee(101,"Anil","anil@gmail.com", 65000,"laptops");
		AdminEmployee ad=new AdminEmployee(103, "prakash","prakash@gmail.com",55000, "readWrite");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction  t=s.beginTransaction();
		s.save(sw);
		s.save(hw);
		s.persist(ad);
		t.commit();
		System.out.println("SucessFully inserted");
		
		
	}

}
