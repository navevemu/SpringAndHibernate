package services;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class MI implements MethodInterceptor{


	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Log l=LogFactory.getLog(this.getClass());
		l.info("Invoke 1");
		Object r=arg0.proceed();
		l.info("Invoke 2"+arg0.getArguments());
		return r;
	}

	
	}

	
	


