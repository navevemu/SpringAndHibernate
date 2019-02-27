package springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("resources/spring.xml"));
		HelloWord h=(HelloWord)bf.getBean("helloWorld");
h.msg();
	}

}
