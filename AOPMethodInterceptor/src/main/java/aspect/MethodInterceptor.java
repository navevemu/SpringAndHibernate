package aspect;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MethodInterceptor implements org.aopalliance.intercept.MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l=LogFactory.getLog(this.getClass());
		l.info("Before depositing the total amount in your account is "+mi);
		Object ret=mi.proceed();
		l.info("After depositing the total amount in your account is "+ret);
		return ret;
	}

}
