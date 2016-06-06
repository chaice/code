package com.ccit.admin;

public class Major {
	private Integer id;
	private String name;
	public Major(){
		
	}
	public Major(Integer id , String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Major [id=" + id + ", name=" + name + "]";
	}
	

}
