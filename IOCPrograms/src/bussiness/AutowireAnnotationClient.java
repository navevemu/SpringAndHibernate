package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.AutowireAnnotation;

public class AutowireAnnotationClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/AutowireAnnotation.xml");
		AutowireAnnotation aa=(AutowireAnnotation)a.getBean("AA");
		System.out.println(aa);
		
		
	}

}
