package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInterest implements MethodReplacer{
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("15% interrest");
		return obj;
	}

}
