package bussiness;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.ConstructorInjection;

public class Client2 {

	public static void main(String[] args) {
	ApplicationContext a=new ClassPathXmlApplicationContext("resources/Test2.xml");
		//Resource r=new ClassPathResource("resources/Test2.xml");
		//BeanFactory b=new XmlBeanFactory(r);
		ConstructorInjection c=(ConstructorInjection)a.getBean("CI");
		c.diplay();

	}

}
