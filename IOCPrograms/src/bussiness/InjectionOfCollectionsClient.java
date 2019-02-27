package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.InjectionOfCollections;

public class InjectionOfCollectionsClient {

	public static void main(String[] args) {
ApplicationContext a=new ClassPathXmlApplicationContext("resources/CollectionInjection.xml");
InjectionOfCollections ic=(InjectionOfCollections)a.getBean("IC");
System.out.println(ic);
	}

}
