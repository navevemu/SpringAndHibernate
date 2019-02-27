package student;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
//StudentDao sd;
	//StudentModel sm;
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("resources/student.xml");
		StudentDao sd=(StudentDao)c.getBean("ds");
		StudentModel sm=(StudentModel)c.getBean("sm");
		try{
//int i=sd.save(sm);
//System.out.println(i);
			List<StudentModel> l=sd.findById(100);
			Iterator<StudentModel> i=l.iterator();
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
