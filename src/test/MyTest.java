package test;

import static org.junit.Assert.*;

import org.junit.Test;

import person.tevop.service.ServiceFactory;
import person.tevop.service.UserService;

public class MyTest {

	@Test
	public void test() {
		UserService userService = ServiceFactory.createUserService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
