package com.ccit.cc;
/*�ӿ�interface ����̳����ƣ�����ʵ�ֲ�ͬ��֮�䡣�ӿ�֮��Ϊ�еĹ�ϵ
 * ��ֻ����һ�����࣬���ǿ����ж���ӿڣ��ӿڲ����Ա�ʵ�������ڽӿڵ�ʵ�����б�����д�ӿ��ڵķ���
 * �ӿ�֮����Լ̳У��ӿڵı������Ǿ�̬������ʵ�������ʵ�ֶ���ӿڡ�
 * �ӿ��еķ���Ϊ��public abstract void ��������   public abstract����ʡ��
 * ���л���������ת��Ϊ���������ݣ��������л��뷴���л��������implementsʵ�� java.io.Serializable�ӿ�
 * ���л��뷴���л����Ƕ���
 * ���Բ��������л�������ǰ���transient�ؼ��֡�
 * ����������л�������һ���������л������������Ƿ�ʵ��java.io.Serializable.
 * �����л���û�н�������������Ե����ö���Ҳ�ᱻ���л�.
 * �����ֲ��ڲ��ࣺ�ӿڲ���ʵ���������þֲ��ڲ���ʵ������ֻ������һ�Σ�����Ҫ�����ӿڵ�ʵ����
 * 
 */

public class Test  {
	public static void main(String[] args) {
		UseUsb uu = new UseUsb();
		IUsb iu = new IUsb() {//�����ֲ��ڲ���
			
			@Override
			public void dirver() {
				System.out.println("iusb");
				
			}
		};
		uu.use(iu);
		IUsb iu1 = new MoUsb();
		IUsb iu2 = new DiUsb();
		IUsb[] iu3 = { iu1, iu2 };
		for (IUsb iUsb : iu3) {
			uu.use(iUsb);
		}

	}
}
