package com.kaishengit.entity;

public class Contact {
	private String name;
	private String phone;
	private String sex;
	private String birthday;

	public Contact() {
		
	}

	public Contact(String name, String phone, String sex, String birthday) {
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
