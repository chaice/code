package com.ccit.thread;
/*Thread ���߳�ʵ�ַ�����
 * �٣��Զ���Thread�ļ̳���,���Զ���������дrun()����
 * �ڣ��Զ���Runnable�Ľӿ�ʵ���� (runnable target)����������дrun()����
 * ��main()����Thread��Thread������Ķ��󣬶�����.strart()���ö��̣߳�
 * ������.sleep()���߳�����,������.join()���߳�������Ϻ������̲߳ſ�����
 * ������.setDaemon(boolean on)���߳������߳̽�����Ҳ���������һ����ʱ��onΪtrue���߳�Ϊ�ػ��߳�
 * ������.field()��ͣ���̣߳������������߳�
 * Thread.currentThread().getName()�õ����̵߳�����
 * ���߳���ʹ��
 * �첽�ص�����������󲻵ȴ���Ӧ��ȥ���������
 * �߳�ͬ��
 */
public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread th = new Thread(new RunnAble());
		th.start();
		mt.start();
		
		
	}

}
