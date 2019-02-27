package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.CarInterface;

public class CarInstanceFactoryClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/carInstanceFactory.xml");
		CarInterface c=(CarInterface)a.getBean("C");
		c.drive();
	}

}
