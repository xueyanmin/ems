package com.ems.entity;

public class Person {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private double  salary;
	private int age;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", age=" + age + "]";
	}
	
}
