package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
String files[]=new String[] {"resources/car.xml","resources/engine.xml"};
ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");
System.out.println(ap.getBean("c"));

	}

}
