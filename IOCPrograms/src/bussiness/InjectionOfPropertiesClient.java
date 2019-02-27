package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.InjectionOfProperties;

public class InjectionOfPropertiesClient {

	public static void main(String[] args) {
	ApplicationContext a=new ClassPathXmlApplicationContext("resources/InjectionOfProperties.xml");
		InjectionOfProperties ip=(InjectionOfProperties)a.getBean("p");
		System.out.println(ip);
		
	
	
	}

}
