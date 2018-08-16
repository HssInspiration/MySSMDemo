package com.hss.entity;
/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {

	private Integer id;// 用户id
	private String passWord;// 用户密码
	private String userName;// 用户姓名

	public User() {
		super();
	}

	public User(Integer id, String userName, String passWord) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}

	public Integer getId() {
		return id;
	}

	public String getPassWord() {
		return passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
