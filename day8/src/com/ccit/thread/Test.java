package com.ccit.thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("打电话叫外卖！");
		WaiMai wm = new WaiMai();
		wm.eat(new DoEve() {
			
			@Override
			public void some() {
				System.out.println("拿到饭开始吃饭！");
				
			}
		});
		Thread.sleep(88);
		System.out.println("打完电话继续忙！");
	}

}
