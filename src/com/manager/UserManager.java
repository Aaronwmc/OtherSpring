package com.manager;

import com.dao.UserDao;

public class UserManager {

	private UserDao dao;
	public void save(String uname,String pwd){
		dao.save(uname, pwd);
	}
	
	public UserDao getDao(){
		return dao;
	}
	public void setDao(UserDao dao){
		this.dao = dao;
	}
}
