package pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class DepositPointCut extends StaticMethodMatcherPointcutAdvisor {

	public boolean matches(Method m, Class<?> arg1) {
		
		String mName=m.getName();
		if(mName.equals("deposit"))
			return true;
		else
		return false;
	}

}
