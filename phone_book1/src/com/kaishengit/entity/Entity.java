package com.kaishengit.entity;

public class Entity {
    String name;
    String phone;
    String adress;
    public Entity(){
    	
    }
    public Entity(String name,String phone,String adress){
    	this.name = name;
    	this.adress = adress;
    	this.phone = phone;
    }
	public String getNames() {
		return name;
	}
	public void setNames(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
