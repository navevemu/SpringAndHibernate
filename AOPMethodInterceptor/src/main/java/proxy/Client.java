package proxy;

import org.springframework.aop.framework.ProxyFactoryBean;


import aspect.MethodInterceptor;
import bussiness.Bank;

public class Client {

	public static void main(String[] args) {
		Bank b=new Bank();
		MethodInterceptor mi=new MethodInterceptor();
		ProxyFactoryBean pf=new ProxyFactoryBean();
		pf.setTarget(b);
		pf.addAdvice(mi);
		//pf.setInterceptorNames(new String[] {"l"});
		
		Bank bproxy=(Bank) pf.getObject();
		bproxy.deposit(500000);
		
	System.out.println();
		
		
		
		}
		
		

	}


