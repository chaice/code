package com.ccit.admin;

public class Subject {
	private Integer id;
	private String name;
	private Integer classhour;
	private Integer majorid;
	
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
	public Integer getClasshour() {
		return classhour;
	}
	public void setClasshour(Integer classhour) {
		this.classhour = classhour;
	}
	public Integer getMajorid() {
		return majorid;
	}
	public void setMajorid(Integer majorid) {
		this.majorid = majorid;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", classhour="
				+ classhour + ", majorid=" + majorid + "]";
	}

}
