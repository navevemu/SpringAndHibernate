package proxy;

import org.springframework.aop.framework.ProxyFactoryBean;

import aspect.ARA;

import bussiness.Bank;

public class Client {

	public static void main(String[] args) {
		Bank b=new Bank();
		ARA alog=new ARA();
		ProxyFactoryBean pf=new ProxyFactoryBean();
		pf.setTarget(b);
		pf.addAdvice(alog);
		//pf.setInterceptorNames(new String[] {"l"});
		
		Bank bproxy=(Bank) pf.getObject();
		
	System.out.println(bproxy.deposit(50000));
		
		
		
		}
		
		

	}


