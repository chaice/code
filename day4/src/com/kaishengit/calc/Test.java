package com.kaishengit.calc;
/*�����滻ԭ���κλ�����ֵĵط������඼���Գ���
 * �������Ͳ���������Ϊ��������������Ϊ��������
 * ���಻��ʵ������ֻ��ʵ�����������ࡣ
 * ����ģʽ�����ҵ��ʹ������֮�����ϵ��С����ʹһ�����޸�Ҳ����Ӱ�������ࡣ
 * ��������Ϊ�����࣬����������д����ķ���@override//�����಻�ܱ�ʵ���������󷽷�û�з����壡����
 * ��������滻����---���� ������ = new ����()��
 * public ���� Factory(String str ){ //**����ֵΪ��������
 * ���� ������ = null ;//����һ���������������ʼֵΪnull
 * switch(str){ //��switch�ڵı�����������case�����ʱ��ִ��case�ڵ����
 * case "1" :
 * (����)������ = new ����1();
 * break;
 * case "2":
 * (����)������ = new ����2();
 * break;
 * ......
 * }
 * return (����)��������
 * }
 * �ؼ���instance of�������ж��������������Ƿ�ƥ�䣬��ʽ��(����)������ instance of ���࣬����ֵ����Ϊboolean��
 * ��ƥ��ʱ���Ϊtrue������Ϊfalse
 */
public class Test {

	public static void main(String[] args) {
		CalcFactory cf = new CalcFactory();
		System.out.println(cf.calc("+").calc(1, 3));
		System.out.println(cf.calc("*").calc(2, 3));
		System.out.println(cf.calc("-").calc(2, 3));
		System.out.println(cf.calc("/").calc(2, 3));
		
	}

}
