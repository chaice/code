package com.ccit.thread;
/*Thread 多线程实现方法：
 * ①：自定义Thread的继承类,在自定义类中重写run()方法
 * ②：自定义Runnable的接口实现类 (runnable target)，在其中重写run()方法
 * 在main()创建Thread或Thread的子类的对象，对象名.strart()启用多线程，
 * 对象名.sleep()此线程休眠,对象名.join()此线程运行完毕后其余线程才可运行
 * 对象名.setDaemon(boolean on)此线程在主线程结束后也会结束，有一定的时间差，on为true此线程为守护线程
 * 对象名.field()暂停此线程，并运行其他线程
 * Thread.currentThread().getName()得到此线程的名字
 * 在线程中使用
 * 异步回调，发起请求后不等待响应就去做别的事情
 * 线程同步
 */
public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread th = new Thread(new RunnAble());
		th.start();
		mt.start();
		
		
	}

}
