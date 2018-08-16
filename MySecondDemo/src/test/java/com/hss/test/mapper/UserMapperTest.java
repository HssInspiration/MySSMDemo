package com.hss.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hss.entity.User;
import com.hss.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	// @Resource
	public UserMapper userMapper;

	/**
	 * 测试userMapper中的增加方法
	 * 
	 * @throws Exception
	 */
	@Test
	// @Transactional // 可加可不加
	@Rollback(false)
	public void testAdd() throws Exception {
		User user = new User();
		user.setUserName("张无忌");
		user.setPassWord("111111");
		int result = userMapper.addUser(user);
		org.junit.Assert.assertEquals(1, result);
	}

	/**
	 * 测试userMapper中的删除方法
	 * 
	 * @throws Exception
	 */
	@Test
	@Rollback(false)
	public void testDelete() throws Exception {
		User user = new User();
		user.setId(4);
		int result = userMapper.deleteUser(user);
		org.junit.Assert.assertEquals(1, result);
	}

	/**
	 * 测试userMapper中的更新方法
	 * 
	 * @throws Exception
	 */
	@Test
	@Rollback(false)
	public void testUpdate() throws Exception {
		User user = new User();
		user.setUserName("张翠山");
		user.setPassWord("123456");
		int result = userMapper.updateUser(user);
		org.junit.Assert.assertEquals(1, result);
	}
	/**
	 * 通过一个用户姓名查询一个用户信息
	 * @throws Exception
	 */
	@Test
//	@Rollback(false)
	public void testQuery() throws Exception{
		String userName = "张翠山";
		User user = userMapper.queryUser(userName);
		if(user != null){
			System.out.println("当前所查询的User为："+user);
		}
		org.junit.Assert.assertNotNull(user);
	}
}
