package com.hss.service;

import com.hss.entity.User;

public interface IUserService {
	/**
	 * 通过用户名查询一条用户信息
	 * @param userName
	 * @return
	 */
	User queryUser(String userName);
}
