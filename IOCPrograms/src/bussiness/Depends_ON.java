package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Depends_ON {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/DependsOn.xml");
		
	}

}
