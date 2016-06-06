package com.ccit.test;

public class MobilePhone extends Phone implements InforInterface {

	@Override
	public void info() {
		System.out.println("news");
		
	}

	@Override
	public void call() {
		System.out.println("call phone");
		
	}
	

}
