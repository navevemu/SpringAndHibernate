package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RequiredCollectionClassesTest {

	public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/requiredCollections.xml");
System.out.println(ap.getBean("dc"));
	}

}
