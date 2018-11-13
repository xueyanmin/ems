package com.ems.service;

import com.ems.entity.User;

public interface UserService {
	public void regist(User user);
	public boolean login(String username,String password);
}
