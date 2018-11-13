package com.ems.test;

import org.junit.Test;

import com.ems.dao.UserDAO;
import com.ems.entity.User;
import com.ems.service.UserService;
import com.ems.service.Impl.UserServiceImpl;
import com.ems.util.MyBatisUtil;

public class TestUser {
	@Test
	public void testregist(){
		UserService impl = new UserServiceImpl();
		User user = new User();
		user.setSex("F");
		user.setPassword("后果你能");
		user.setRealname("材料");
		user.setUsername("硈");
		impl.regist(user);
	}
	@Test
	public void testlogin(){
		//UserDAO userDAO = (UserDAO) MyBatisUtil.getMapper(UserDAO.class);
		UserService impl = new UserServiceImpl();
		boolean a = impl.login("123456", "1313");
		System.out.println(a);
	}
	
}
