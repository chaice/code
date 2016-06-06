package com.ccit.java;

import java.io.Serializable;

public class Way implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Way [name=" + name + ", age=" + age + "]";
	}
	public Way(){
		
	}
	public Way(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
