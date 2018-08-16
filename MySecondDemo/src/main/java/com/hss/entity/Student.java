package com.hss.entity;

public class Student {
	private String stuName;
	private String id;
	private Integer gender;
	private Integer age;

	public Student() {
		super();
	}

	public Student(String stuName, String id, Integer gender, Integer age) {
		super();
		this.stuName = stuName;
		this.id = id;
		this.gender = gender;
		this.age = age;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String toString() {
		return "Student [stuName=" + stuName + ", id=" + id + ", gender=" + gender + ", age=" + age + "]";
	}

}
