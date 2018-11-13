package com.ems.service;

import java.util.List;

import com.ems.entity.Person;

public interface PersonService {
		public List<Person> ShowAll();
		public void delPerson(int id);
		public void update(Person person);
		public void reg(Person person);
}
