
package com.ccit.thread;

public class Dog {
	public void eat(final DoEve de){
		Thread tr = new Thread(new Runnable() {
			
			@Override
			public void run() {
			 System.out.println("¹·¿ªÊ¼³Ô·¹£¡");
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("¹·³ÔÍêÁË£¡");
			de.some();
			}
		});
		tr.start();
	}

}
