package com.ccit.cc;

public class MyThread extends Thread{
	@Override
       public void run(){
		for (int i = 0; i < 7; i++) {
			try {
				Thread.sleep(666);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread"+i);
		}
       }
}
