package studentAppUsingSpringJdbc.Model;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
//StudentDao sd;
	//StudentModel sm;
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("resources/studentAppUsingSpringJdbc.xml");
		StudentDao sd=(StudentDao)c.getBean("jd");
		StudentModel sm=(StudentModel)c.getBean("sm");
		try{
//int i=sd.save(sm);
//System.out.println(i);
			List<String> l=sd.findById(100);
			Iterator<String> i=l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
				
			}
	} 
catch(Exception e)
		{
	e.printStackTrace();		}
	}
}
