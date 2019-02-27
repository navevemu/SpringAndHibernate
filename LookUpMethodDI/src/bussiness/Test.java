package bussiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;
public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("/resources/lookUpMethodDI.xml");
		System.out.println("Car Interface Method Impletation");
		Car c=(Car)a.getBean("c");
		System.out.println(c.getClass().getName());
		System.out.println(c.myCarEngine().getName());
		System.out.println("Bus Abstract Method Impletation");
		Bus b=(Bus)a.getBean("B");
		System.out.println(b.getClass().getName());
		System.out.println(b.myBusEngine().getName());
		System.out.println("Truck class  Methodoveririding ");
		Truck t=(Truck)a.getBean("T");
		System.out.println(t.getClass().getName());
		System.out.println(t.MyTruckEngine().getName());
	}

}
