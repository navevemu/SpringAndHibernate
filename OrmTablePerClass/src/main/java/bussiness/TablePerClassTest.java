package bussiness;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.HWEmployee;
import entities.SCEmployee;
import entities.SWEmployee;

public class TablePerClassTest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("/resources/emp.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		SWEmployee sw=new SWEmployee();
		sw.setName("Navee Royal");
		sw.setEmail("naveenroyal.666@gmail.com");
		sw.setSalary(80000);
		sw.setTool("Devops");
		System.out.println(s.save(sw));
		SCEmployee sc=new SCEmployee();
		sc.setName("prakash");
		sc.setEmail("prakash@gmail.com");
		sc.setSalary(15000);
		sc.setGateName("Front Gate");
		System.out.println(s.save(sc));
		HWEmployee hw=new HWEmployee();
		hw.setName("Raju");
		hw.setEmail("Raju@gmail.com");
		hw.setSalary(30000);
		hw.setDep("ITICS");
		System.out.println(s.save(hw));
		t.commit();
		s.close();
		sf.close();
		
		
	}

}
