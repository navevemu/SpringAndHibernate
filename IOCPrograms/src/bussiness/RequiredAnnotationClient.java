package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.RequiredAnnotationEg;

public class RequiredAnnotationClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/RequiredAnnotation.xml");
		
		RequiredAnnotationEg ra=(RequiredAnnotationEg)a.getBean("RA");
		System.out.println(ra);
		
		
		
	}

}
