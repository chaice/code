package com.ccit.test;

import java.io.Serializable;

public class Way implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String names;
	private String age;
	public Way(){
		
	}
	public Way(String names,String age){
		this.names = names;
		this.age = age;
		
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Way [names=" + names + ", age=" + age + "]";
	}
	


}
