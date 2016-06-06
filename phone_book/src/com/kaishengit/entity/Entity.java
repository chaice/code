package com.kaishengit.entity;

import java.io.Serializable;

public class Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String names;
	private String phones;

	

	public Entity(String names, String phones) {
		super();
		this.names = names;
		this.phones = phones;
	}

	public String getName() {
		return names;
	}

	public void setName(String name) {
		this.names = name;
	}

	public String getPhone() {
		return phones;
	}

	public void setPhone(String phone) {
		this.phones = phone;
	}

	@Override
	public String toString() {
		return "Entity [Ãû×Ö=" + names + ", ºÅÂë=" + phones + "]";
	}
	

}
