package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import entities.Student;

public class StudnetDao {
	
	Configuration cfg;
	SessionFactory sf;
	public  StudnetDao()
	{
		cfg=new Configuration();
		cfg.configure("/resources/student.cgf.xml");
		sf=cfg.buildSessionFactory();
	}

	public int save(Student s) {
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		int pk=(Integer) ss.save(s);
		t.commit();
		ss.close();
		return pk;
	}
	public int update(Student s) {
		
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
				
		Query q=ss.createQuery("update Student set mobno=? where sid=?");
		q.setParameter(1, s.getMobno());
		q.setParameter(2, s.getSid());
		int pk=q.executeUpdate();
		t.commit();
		return pk;
	}
	
	public List<Student> search( String name) {
		
		Session ss=sf.openSession();
		Criteria c=ss.createCriteria(Student.class);
		c.add(Restrictions.eq("sname", name));
		return c.list();
		
		
	}
}
