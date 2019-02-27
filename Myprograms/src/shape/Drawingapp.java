package shape;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Drawingapp {

	public static void main(String[] args) {
		//Triangle t1= new Triangle();
		Resource r=new ClassPathResource("/shape/spring.xml");
		@SuppressWarnings("deprecation")
		BeanFactory b1=new XmlBeanFactory(r);
		Triangle t1=(Triangle) b1.getBean("triangle");
		Triangle t2=(Triangle) b1.getBean("triangle");
		Triangle t3=(Triangle) b1.getBean("triangle");
		t1.draw();
	}

}
