package com.kaishengit.cc;

public abstract class Pet  {
	private  String name;
	private String age;
	public Pet(){
		//System.out.println("���췽����");
	}
	public Pet(String str){
		System.out.println("���췽��"+str);
	}
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
	public abstract void eat();
//	public abstract void sound();
}
