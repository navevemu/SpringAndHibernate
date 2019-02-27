package proxy;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aspect.ARA;

import bussiness.Bank;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("/resources/spring.xml");
		Bank bproxy=(Bank) con.getBean("pf");
		
		
	System.out.println(bproxy.deposit(50000));
	System.out.println(bproxy.findBalance("SBI1108"));
		
		}
		
		

	}


