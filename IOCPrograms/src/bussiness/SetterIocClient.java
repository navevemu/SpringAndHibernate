package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.SetterIoc;

public class SetterIocClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/setterIoc.xml");
		SetterIoc si=(SetterIoc)a.getBean("SI");
		si.cologeInfo();
		
	}

}
