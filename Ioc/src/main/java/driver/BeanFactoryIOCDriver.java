package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryIOCDriver {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/BeanFactoryIoc.xml"); 
		BeanFactory b =new XmlBeanFactory(resource);
		System.out.println(b.getBean("bf"));
		System.out.println(b.getBean("bf"));
		

	}

}
