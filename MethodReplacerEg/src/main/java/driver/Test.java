package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank b=ap.getBean("b",Bank.class);
		b.withDraw();
b.calIntrest();
	}

}
