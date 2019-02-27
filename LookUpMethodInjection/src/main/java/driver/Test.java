package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Look.xml");
	Car c=(Car)ap.getBean("c");
	System.out.println(c.myEngine());
	System.out.println(c.getClass());
	System.out.println("============================");
Bus b=ap.getBean("b",Bus.class);
System.out.println(b.myEngine());
System.out.println(b.getClass());
System.out.println("============================");

Truck t=ap.getBean("t",Truck.class);
System.out.println(t.myEngine());
System.out.println(t.getClass());
	}

}
