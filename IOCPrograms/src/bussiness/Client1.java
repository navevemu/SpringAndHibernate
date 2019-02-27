package bussiness;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client1 {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("resources/Test1.xml");
		BeanFactory b=new XmlBeanFactory(r);
		b.getBean("t");
		b.getBean("t");
		
	}

}
