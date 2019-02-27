package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class ComponentAnnotation {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/ComponentAnnotation.xml");
		Car c=(Car)a.getBean(Car.class);
		System.out.println(c);
		
	}

}
