package com.ccit.thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("��绰��������");
		WaiMai wm = new WaiMai();
		wm.eat(new DoEve() {
			
			@Override
			public void some() {
				System.out.println("�õ�����ʼ�Է���");
				
			}
		});
		Thread.sleep(88);
		System.out.println("����绰����æ��");
	}

}
