package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ParticularCollectionDI;

public class ParticularCollectionDIClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/ParticularCollection.xml");
		ParticularCollectionDI p=(ParticularCollectionDI)a.getBean("IC");
		System.out.println(p);
	}

}
