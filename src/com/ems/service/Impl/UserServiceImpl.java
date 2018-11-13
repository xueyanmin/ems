package com.ems.service.Impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ems.dao.UserDAO;
import com.ems.entity.User;
import com.ems.service.UserService;
import com.ems.util.MyBatisUtil;

public class UserServiceImpl implements UserService {

	private SqlSession sqlSession;

	@Override
	public void regist(User user) {
		try {
			/*InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = factory.openSession();
			UserDAO userDAO = sqlSession.getMapper(UserDAO.class);*/
			UserDAO userDAO = (UserDAO) MyBatisUtil.getMapper(UserDAO.class);
			userDAO.insert(user);
			 MyBatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
			 MyBatisUtil.rollback();
		}

	}

	@Override
	public boolean login(String username,String password) {
		UserDAO userDAO = (UserDAO) MyBatisUtil.getMapper(UserDAO.class);
		User user = userDAO.queryById(username, password);
		if(user!=null){
			return true;
		}
		else{
			return false;
		}
	}

}
