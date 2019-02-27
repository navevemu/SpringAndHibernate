package driver;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {

	public static void main(String[] args) {		
		ApplicationContext ap=new ClassPathXmlApplicationContext("/resources/static.xml");
		Car c=(Car)ap.getBean(Car.class);
		System.out.println(c.getCarName());
	}

}
