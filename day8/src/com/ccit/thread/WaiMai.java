package com.ccit.thread;

public class WaiMai {
	public void eat(final DoEve ev){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("�ӵ��绰����ʼ������");
				try {
					Thread.sleep(555);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("�������ͷ���");
				ev.some();
			}
		}).start();
	}

}
