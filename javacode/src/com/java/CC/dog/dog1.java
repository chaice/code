package com.java.CC.dog;

/*���췽���޷���ֵ������������ͬ������:new ����
 * ���췽�����أ�������ͬ��������ͬ(�����������������ͣ�����˳��
 * ���췽��û�з���ֵ�����ܽ��и�ֵ����
 * ���������빹�췽������һ������������ͬ������ͬ
 * �ɱ������������ڲ����б������������ͱ���һ�£�������ʽ��
 * ��������������������...������        һ������ֻ����һ���ɱ����
 * ��ľ�̬��Ա���ؼ���static
 * ʹ��static���εķ������Ա����Ϊ���Ա�����Ա��ʹ�÷�ʽ������.������ ������
 * û��ʹ��static ���ε�Ϊ�����Ա�������Ա��ʹ�÷�ʽ��������.������ ������
 * ��̬��Ա�ķ�����֮��ʹ�þ�̬��Ա������ʹ�ö����Ա
 * ��̬����飬static{},ֻ�������һ�γ�ʼ��ִ��һ��
 * final �ؼ��֣����峣��������ȫ����д������������޸�
 * ����ģʽ���ٹ��췽��˽�Тڴ�����̬��Ա��д��̬����������ȡ������ģʽʹ
 * ��ֻ��ʵ����һ�Ρ�
 */
public class dog1 {
	public static void main(String[] args) {
		User n = new User();
		//n.name = "С��";
		User.age = 1;
		//n.sayHi();
		System.out.println(n.getName());
		System.out.println(n.area(3));
		new User();
		new User("CC");
		int j = n.sum(1,2,3,4,5,6,7,8,9);
		System.out.println(j);
	}

}

class User {
	static String name;
	double area;
	static int age;//���Ա
	final double PI = Math.PI;

	public  User() {
		System.out.println("���췽��");
	}

	public User(String name) {
		System.out.println("������" + name);
	}

	public static void sayHi() {//���Ա
		System.out.println("�������" + name);
	}

	public void sayHi(int age) {
		System.out.println("����ҵ������ǣ�" + age);
	}

	public int sum(int... sums) {//�ɱ����
		int temp = 1-1;
		for (int i : sums) {
			temp += i;
		}
		return temp;
	}

	public String getName() {

		// System.out.println(name);
		return name;
	}

	public double area(double r) {
		double area = r * r * PI;
		return area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
//	private User(){
//		System.out.println("����ģʽ");
//	}
//	private static User d = new User();
//	public static User newUser(){
//		return d;
//	}

}
