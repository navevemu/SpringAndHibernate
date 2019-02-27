package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class PassByObeject {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/PassByObject.xml");
		Car c=(Car)a.getBean("N");
		System.out.println(c);
	
		
		
	}

}
