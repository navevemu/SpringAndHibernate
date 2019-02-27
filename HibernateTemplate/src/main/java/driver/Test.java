package driver;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.StudentDao;
import model.Student;

public class Test {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("/resources/spring.xml");
HibernateTemplate ht=(HibernateTemplate) con.getBean("ht");


		StudentDao sd=(StudentDao)con.getBean("st");
Student st=new Student();
st.setId(107);
st.setSname("naresh");
st.setGrade("B");
st.setEmail("naresh@gmail.com");
st.setMarks(87);
st.setAddress("Tadiaptri");
//System.out.println(sd.save(st));
System.out.println(sd.findbyPk(100));
System.out.println(sd.findAll());


	}

}
