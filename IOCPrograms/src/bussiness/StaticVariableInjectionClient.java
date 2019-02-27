package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.StaticVaribaleInjection;

public class StaticVariableInjectionClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/StaticVaribleInjection.xml");
		StaticVaribaleInjection s=(StaticVaribaleInjection)a.getBean(StaticVaribaleInjection.class);
		s.diplay();
	}

}
