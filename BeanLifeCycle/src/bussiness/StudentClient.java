package bussiness;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca=new ClassPathXmlApplicationContext("/resources/programatic.xml");
		StudentDao sd=(StudentDao)ca.getBean("sdi");
		sd.save();
		
		
		
		
		
		
	}

}
