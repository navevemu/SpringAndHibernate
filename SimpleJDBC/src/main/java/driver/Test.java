package driver;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;

public class Test {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("/resources/spring.xml");
StudentDao sd=(StudentDao)con.getBean("st");
//System.out.println(sd.save(null));
System.out.println(sd.findbyPk(100));


	}

}
