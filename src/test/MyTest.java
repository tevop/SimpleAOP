package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import person.tevop.service.ServiceFactory;
import person.tevop.service.UserService;

public class MyTest {

	@Test
	public void test() {
//		UserService userService = ServiceFactory.createUserService();
//		userService.addUser();
//		userService.updateUser();
//		userService.deleteUser();
	}
	
	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = context.getBean("userService", UserService.class);
		service.addUser();
		service.deleteUser();
		context.close();
	}
}
