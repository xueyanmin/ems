package com.ems.test;

import java.util.List;

import org.junit.Test;

import com.ems.dao.PersonDAO;
import com.ems.entity.Person;
import com.ems.service.PersonService;
import com.ems.service.Impl.PersonServiceImpl;
import com.ems.util.MyBatisUtil;

public class TestPerson {
	@Test
	public void showAll(){
		/*PersonDAO personDao = (PersonDAO) MyBatisUtil.getMapper(PersonDAO.class);
		
		List<Person> list = personDao.queryAll();*/
		PersonService impl = new PersonServiceImpl();
		List<Person> list = impl.ShowAll();
		for(Person a:list){
			System.out.println(a);
			
		}
	}
	@Test 
	public void del(){
		PersonService impl = new PersonServiceImpl();
		impl.delPerson(10);
	}
	@Test 
	public void update(){
		PersonService impl = new PersonServiceImpl();
		Person person = new Person();
		person.setId(7);
		person.setAge(100);
		person.setName("99999992");
		person.setSalary(166666);
		impl.update(person);
	}
	@Test 
	public void insert(){
		PersonService impl = new PersonServiceImpl();
		Person person = new Person();
		//person.setId(7);
		person.setAge(100);
		person.setName("玉儿");
		person.setSalary(1666);
		impl.reg(person);
	}
}
