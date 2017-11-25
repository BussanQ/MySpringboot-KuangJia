package com.bussanq.group.alpha.service;

import com.bussanq.group.alpha.bean.UserData;
import com.bussanq.group.alpha.mapper.UserDataMapper;
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
