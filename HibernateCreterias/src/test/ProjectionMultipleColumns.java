package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

import beans.Employee;

public class ProjectionMultipleColumns {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("resources/employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Criteria c=s.createCriteria(Employee.class);
		PropertyProjection p=Projections.property("empid");
		PropertyProjection p1=Projections.property("ename");
		ProjectionList pl=Projections.projectionList();
		pl.add(p);
		pl.add(p1);
		c.setProjection(pl);
		List<Object[]> l=c.list();
		System.out.println("details");
		for(Object []e:l){
			System.out.println("details");
			
			System.out.println(e[0]);
			System.out.println(e[1]);
		
		}



	}

}
