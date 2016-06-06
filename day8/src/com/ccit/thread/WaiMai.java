package com.ccit.thread;

public class WaiMai {
	public void eat(final DoEve ev){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("接到电话，开始做饭！");
				try {
					Thread.sleep(555);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("饭做好送饭！");
				ev.some();
			}
		}).start();
	}

}
