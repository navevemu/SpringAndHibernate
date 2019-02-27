package services;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.aop.MethodBeforeAdvice;

public class MBA  implements MethodBeforeAdvice{
private Log l=LogFactory.getLog(this.getClass());
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		l.info("Before deposit "+arg1);
		System.out.println("Hello this MBA");
		
	}

}
