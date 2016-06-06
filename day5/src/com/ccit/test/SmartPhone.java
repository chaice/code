package com.ccit.test;

public class SmartPhone extends MobilePhone implements NetworkInterface {
   
    
	@Override
	public void netWork() {
		super.call();
		super.info();
		System.out.println("net");
		
	}
        
}
