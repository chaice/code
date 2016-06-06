package com.ccit.phone;

import java.io.Serializable;

public class Entity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String phone;
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
	@Override
	public String toString() {
		return "Entity [name=" + name + ", phone=" + phone + "]";
	}
	public Entity(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	

}
