package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PropertiesDi;

public class PropertiesDITest {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/PropertiesDI.xml");
PropertiesDi pr=(PropertiesDi)ap.getBean("p");
pr.printData();
	}

}
