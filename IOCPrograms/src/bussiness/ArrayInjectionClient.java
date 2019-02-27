package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ArrayInjection;

public class ArrayInjectionClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/ArrayInjection.xml");
		ArrayInjection ai=(ArrayInjection)a.getBean("AI");
		System.out.println(ai);
	}

}
