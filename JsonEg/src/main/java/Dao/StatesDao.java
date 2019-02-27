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
	
	
public List<String> getCountries(){
	Criteria cr=s.createCriteria(StateModel.class);
	cr.setProjection(Projections.distinct(Projections.property("countryName")));
	
	return cr.list();
}



	public List<StateModel> getStatesByCountry(String countryName)
	{
	Criteria cr=s.createCriteria(StateModel.class);
	
		if(countryName!="")
		{
			cr.add(Restrictions.ilike("countryName", countryName));
		}
		
				cr.addOrder(Order.asc("stateName"));
		
		List<StateModel> l=cr.list();
		
		
		
		
		
		return l;
		
	}
	
	
}
