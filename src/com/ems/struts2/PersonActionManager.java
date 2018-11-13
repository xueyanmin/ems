package com.ems.struts2;

import java.util.ArrayList;
import java.util.List;

import com.ems.entity.Person;
import com.ems.service.PersonService;
import com.ems.service.Impl.PersonServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class PersonActionManager extends ActionSupport {
	private Person person;
	private List<Person> list=new ArrayList<Person>();
	private PersonService impl=new PersonServiceImpl();
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Person> getList() {
		return list;
	}
	public void setList(List<Person> list) {
		this.list = list;
	}
	//展示所有信息
	public String showAll(){
		list = impl.ShowAll();
		return "showAllOk";
	}
	//删除信息
	public String delPerson(){
		impl.delPerson(person.getId());
		return "delOk";
	}
	//修改信息
	public String update(){
		impl.update(person);
		return "updateOk";
	}
	//添加信息
	public String regist(){
		impl.reg(person);
		return "addOk";
	}
}
