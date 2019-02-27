package business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class BankTest {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/Bank.xml");
		Bank b=(Bank)a.getBean("b");
		b.customerDtls();
		b.deposit(8000);
		b.withDraw(10000);
	    b.intrestCal();
		
	}

}
