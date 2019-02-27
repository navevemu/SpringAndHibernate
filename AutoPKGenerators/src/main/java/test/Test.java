package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.BookMovieTicket;

public class Test {

	public static void main(String[] args) {
		Configuration con= new Configuration();
		con.configure("resources/Movie.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		BookMovieTicket bm=new BookMovieTicket();
		bm.setMovieName("Leader");
		bm.setShowtime(new Date().getDate());
		bm.setSeatno(101);
		int pk=(Integer) s.save(bm);
		s.beginTransaction().commit();
		BookMovieTicket bm1=s.get(BookMovieTicket.class, pk);
		System.out.println("Ticket details are"+bm1);
		s.close();sf.close();
		
		

	}

}
