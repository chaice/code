package com.ccit.cc;

public class Dog {
	public void eat() {
		System.out.println("����ʼ�Է���");
		try {
			Thread.sleep(1223);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�������ˣ�");
		doSome ds = new doSome() {

			@Override
			public void somthing() {
				Person p = new Person();
				p.playD();

			}
		};
	}
}
