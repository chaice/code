package cc.object.oriented.programming;

public class TestZoo {
	public static void main(String[] args){
	Animal a1 = new Animal();//���ʵ������������Ķ���
	a1.name = "���";//ͨ������.���ԣ�����.�����������������Ӧ�Ĺ���
	a1.age = 3;
	System.out.println("name:"+a1.name+" age��"+a1.age);
	a1.eat();//�������д����ķ���
	a1.sleep();
	
	}
	

}

class Animal {//���һ����
	String name;//�� �����Գ�Ա����
	int age;

	public void eat() {//���а����ķ���
		System.out.println("����Է�");
	}

	public void sleep() {
		System.out.println("����˯��");
	}

}