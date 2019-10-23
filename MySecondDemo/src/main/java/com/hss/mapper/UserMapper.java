package com.hss.mapper;

import com.hss.entity.User;
/**
 * 用户信息Mapper接口
 * @author Administrator
 *
 */

public interface UserMapper {
	/**
	 * 增加一个用户信息
	 * 
	 * @param user
	 * @return
	 */
	Integer addUser(User user);

	/**
	 * 删除一个用户信息
	 * 
	 * @param user
	 * @return
	 */
	Integer deleteUser(User user);

	/**
	 * 更新一个用户信息
	 * 
	 * @param user
	 * @return
	 */
	Integer updateUser(User user);

	/**
	 * 查询一个用户信息
	 * 
	 * @param userName
	 * @return
	 */
	User queryUser(String userName);
}
