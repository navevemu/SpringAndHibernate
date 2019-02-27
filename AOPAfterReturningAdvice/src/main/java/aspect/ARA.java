package aspect;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class ARA implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
		Log l=LogFactory.getLog(this.getClass());
		l.info("After depositing the tota;l amount in your account is "+arg0);
	}

}
