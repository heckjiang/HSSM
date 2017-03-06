package com.youxuele.service;

import java.util.List;

import com.youxuele.entity.User;

public interface UserService {

	List<User> getUserList(int offset, int limit);
	 
}
