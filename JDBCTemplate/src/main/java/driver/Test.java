package driver;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import model.Student;

public class Test {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("/resources/spring.xml");
StudentDao sd=(StudentDao)con.getBean("st");
Student st=new Student();
st.setId(106);
st.setName("avanthika");
st.setGrade("B");
st.setEmail("avanthika@gmail.com");
st.setMarks(87);
st.setAddress("mumbai");
System.out.println(sd.save(st));
//System.out.println(sd.findbyPk(100));


	}

}
