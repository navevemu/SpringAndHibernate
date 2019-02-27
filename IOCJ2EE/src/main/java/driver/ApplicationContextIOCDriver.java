package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ApplicationContextIOCDriver {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		//System.out.println(a.getBean("bf"));
		//System.out.println(a.getBean("bf"));
		

	}

}
