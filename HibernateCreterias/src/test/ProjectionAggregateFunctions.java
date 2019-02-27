package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

import beans.Employee;

public class ProjectionAggregateFunctions {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("resources/employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Criteria c=s.createCriteria(Employee.class);
		Projection avg=Projections.avg("salary");
		Projection max=Projections.max("salary");
		Projection min=Projections.min("salary");
		ProjectionList pl=Projections.projectionList();
		pl.add(avg);
		pl.add(max);
		pl.add(min);
		c.setProjection(pl);
	
		List<Object[]> l=c.list();
		for (Object object : l) {
			Object ar[]=(Object[])object;
			System.out.println(ar[0]);
			System.out.println(ar[1]);
			System.out.println(ar[2]);
			
			
			
			
		}
	
		}

	}


