package business;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewIntrestCal  implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("new intrest calculation");
		return arg0;
	}

}
