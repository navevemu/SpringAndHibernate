package bussiness;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

import beans.Hello;
import services.ARA;
import services.MBA;
import services.MI;

public class Client {

	public static void main(String[] args) {
		Hello h=new Hello();
		MBA m=new MBA();
		ARA r=new ARA();
		MI i=new MI();
		ProxyFactoryBean p=new ProxyFactoryBean();
		p.setTarget(h);
		p.addAdvice(m);
		p.addAdvice(i);
		p.addAdvice(r);
		
		Hello h1=(Hello) p.getObject();
		h1.hello();
		
		
		
		
	}

}
