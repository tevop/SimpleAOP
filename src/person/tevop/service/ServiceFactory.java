package person.tevop.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceFactory {
	
	public static UserService createUserService() {
		UserService userService = new UserServiceImpl();
		UserService proxy = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(),
				userService.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("before" + method.getName());
						Object obj = method.invoke(userService, args);
						System.out.println("after" + method.getName());
						return obj;
					}
				});
		
		return proxy;
	}

}
