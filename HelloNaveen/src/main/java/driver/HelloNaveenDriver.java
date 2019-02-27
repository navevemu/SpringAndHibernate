package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.springcore.HelloNaveen.HelloNaveenMsg;
public class HelloNaveenDriver {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/spring.xml"); 
		BeanFactory b =new XmlBeanFactory(resource);
		Object obj=b.getBean("m");
		
		HelloNaveenMsg nm=(HelloNaveenMsg) obj;
		HelloNaveenMsg nm1=(HelloNaveenMsg) b.getBean("m");
		nm.printMsg();
		System.out.println(nm==nm1);

	}

}
