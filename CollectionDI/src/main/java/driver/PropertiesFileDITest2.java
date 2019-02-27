package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PropertiesDi;
import beans.PropertiesFileDI;

public class PropertiesFileDITest2 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/PropertiesFileDI.xml");
PropertiesFileDI pr=(PropertiesFileDI)ap.getBean("p");
pr.printData();
	}

}
