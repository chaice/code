
package com.ccit.thread;

public class Dog {
	public void eat(final DoEve de){
		Thread tr = new Thread(new Runnable() {
			
			@Override
			public void run() {
			 System.out.println("����ʼ�Է���");
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�������ˣ�");
			de.some();
			}
		});
		tr.start();
	}

}
