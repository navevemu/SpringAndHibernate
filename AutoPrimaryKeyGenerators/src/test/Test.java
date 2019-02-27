package test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import beans.TicketBook;

public class Test {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("resources/TicketBook.cfg.xml");
		SessionFactory sf= c.buildSessionFactory();
		TicketBook t=new TicketBook();
		//t.settId(100);
		t.setcName("Naveen");
		t.setSeatNo(66);
		t.setMovieName("Leader");
		Session se=sf.openSession();
		int pk=(int) se.save(t);
		Transaction trs=se.beginTransaction();
		trs.commit();
		System.out.println("Sucessfull Saved"+pk);
	se.evict(t);

	}

}
