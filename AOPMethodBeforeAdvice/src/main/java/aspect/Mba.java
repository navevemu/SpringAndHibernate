package aspect;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class Mba implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		Log l=LogFactory.getLog(this.getClass());
		l.info("Before deposit");
		
	}

}
