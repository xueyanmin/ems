package com.ems.service.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ems.dao.PersonDAO;
import com.ems.entity.Person;
import com.ems.service.PersonService;
import com.ems.util.MyBatisUtil;

public class PersonServiceImpl implements PersonService {
	PersonDAO personDao = (PersonDAO) MyBatisUtil.getMapper(PersonDAO.class);
	@Override
	public List<Person> ShowAll() {
		List<Person> list = personDao.queryAll();
		return list;
	}

	@Override
	public void delPerson(int id) {
		SqlSession session = MyBatisUtil.openSession();
		personDao.delPerson(id);
		MyBatisUtil.commit();
		MyBatisUtil.close(session);
	}

	@Override
	public void update(Person person) {
		SqlSession session = MyBatisUtil.openSession();
		personDao.update(person);
		MyBatisUtil.commit();
		MyBatisUtil.close(session);
		
	}

	@Override
	public void reg(Person person) {
		SqlSession session = MyBatisUtil.openSession();
		personDao.insert(person);
		MyBatisUtil.commit();
		MyBatisUtil.close(session);
		
	}

}
