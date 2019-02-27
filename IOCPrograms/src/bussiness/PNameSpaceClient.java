package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PNameSpace;

public class PNameSpaceClient {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/PNameSpace.xml");
		PNameSpace pn=(PNameSpace)a.getBean("PN");
		System.out.println(pn);
	}

}
