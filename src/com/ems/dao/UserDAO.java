package com.ems.dao;

import com.ems.entity.User;

public interface UserDAO {
	public void insert(User user);
	public User queryById(String username,String password);
}
