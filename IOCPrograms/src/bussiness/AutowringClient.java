package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Autowiring;

public class AutowringClient {

public static void main(String[] args) {
ApplicationContext a=new ClassPathXmlApplicationContext("resources/Autowiring.xml");
Autowiring aw= (Autowiring)a.getBean("AW");
System.out.println(aw);
	}

}
