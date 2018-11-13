package com.ems.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ems.entity.Person;

public interface PersonDAO {
	public List<Person> queryAll();
	public void delPerson(@Param("id")Integer id);
	public void update(Person person);
	public void insert(Person person);
}
