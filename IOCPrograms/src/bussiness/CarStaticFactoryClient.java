package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.CarInterface;

public class CarStaticFactoryClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/carStaticFactory.xml");
		CarInterface c=(CarInterface)a.getBean("CF");
		c.drive();
	}

}
