package person.tevop.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Myaspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("begin");
		Object obj = arg0.proceed();
		System.out.println("end");
		return obj;
	}

}
