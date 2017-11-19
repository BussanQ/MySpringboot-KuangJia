package com.bussnaq.group.alpha.service;

import com.bussnaq.group.alpha.bean.UserData;
import com.bussnaq.group.alpha.mapper.UserDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

	@Autowired
	private UserDataMapper userDataMapper;

	public int saveUserData(UserData userData) {
		return userDataMapper.insertUni(userData);
	}
}
