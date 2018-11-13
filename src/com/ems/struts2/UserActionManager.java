package com.ems.struts2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ems.entity.User;
import com.ems.service.UserService;
import com.ems.service.Impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserActionManager extends ActionSupport {
	private User user;
	private UserService impl = new UserServiceImpl();
	
	public UserService getImpl() {
		return impl;
	}
	public void setImpl(UserService impl) {
		this.impl = impl;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String regist(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		String ZYM=request.getParameter("user.yzm");
		HttpSession session=request.getSession();
		String validation=(String) session.getAttribute("validationCode");
		if(validation.equals(ZYM)){
			impl.regist(user);
			return "registOk";
		}else{
			return "page";
		}
	}
	public String login(){

		
		boolean vs = impl.login(user.getUsername(),user.getPassword());
		System.out.println(user.getPassword());
		System.out.println("AAAAA");
		System.out.println(user.getUsername());
		if(vs){

			return "loginOk";
		}else{
			
		return "error";
		}
	}
}
