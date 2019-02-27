package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ConstructorInjection2;

public class ConstructorClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/Cons.xml");
		ConstructorInjection2 c=(ConstructorInjection2)a.getBean("CI");
		c.cologeInfo();
	}

}
