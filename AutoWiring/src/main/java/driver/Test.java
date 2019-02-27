package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext ap=new ClassPathXmlApplicationContext("/resources/ByType.xml");
		//ApplicationContext ap=new ClassPathXmlApplicationContext("/resources/ByName.xml");
		//ApplicationContext ap=new ClassPathXmlApplicationContext("/resources/constructor.xml");
		ApplicationContext ap=new ClassPathXmlApplicationContext("/resources/autodetct.xml");
		System.out.println(ap.getBean("c"));
	}

}
