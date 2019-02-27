package Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;

import model.StateModel;

public class StatesDao {
	
	Configuration cfg;
	SessionFactory sf;
	Session s;
	
	
	

	public StatesDao() {
	cfg=new AnnotationConfiguration();
	cfg.configure("resources/hibernate-cfg.xml");
	sf=cfg.buildSessionFactory();
	s=sf.openSession();
	}
	
	




	public Map<String,String> getStatesByCountry(String countryName)
	{
	Criteria cr=s.createCriteria(StateModel.class);
	Map<String,String> m=new HashMap<String, String>();
		if(countryName!="")
		{
			cr.add(Restrictions.ilike("countryName", countryName));
		}
		
		ProjectionList p=Projections.projectionList();
		p.add(Projections.distinct(Projections.property("stateName")));
		p.add(Projections.property("countryName"));
		
		cr.setProjection(p);
		cr.addOrder(Order.asc("stateName"));
		
		List<Object[]> l=cr.list();
		for(Object []o:l)
		{
			m.put(o[0].toString(),o[1].toString());
		}
		
		System.out.println(l.isEmpty());	
		for(Map.Entry m1:m.entrySet()){  
			   System.out.println(m1.getKey()+" "+m1.getValue());  
			  }  
		
		
		
		return m;
		
	}
	
	
}
