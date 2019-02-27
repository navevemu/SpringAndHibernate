package driver;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("/resources/singleton.xml");
Calendar c=(Calendar)ap.getBean("c");
System.out.println(c.getCalendarType());
	}

}
