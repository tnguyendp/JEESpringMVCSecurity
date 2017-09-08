package com.nguyen.SpringMVCSecurity.dao;

import java.util.List;

import com.nguyen.SpringMVCSecurity.model.UserInfo;

public interface UserInfoDAO {

	public UserInfo findUserInfo(String userName);

	// [USER,AMIN,..]
	public List<String> getUserRoles(String userName);

}
