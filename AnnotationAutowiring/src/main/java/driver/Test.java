package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("/resources/AnnotationAutoWiring.xml");
		System.out.println(ap.getBean("c"));
	}

}
