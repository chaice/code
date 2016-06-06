package cc.object.oriented.programming;

public class TestZoo {
	public static void main(String[] args){
	Animal a1 = new Animal();//类的实例化，创建类的对象
	a1.name = "点点";//通过对象.属性，对象.方法，来调用完成相应的功能
	a1.age = 3;
	System.out.println("name:"+a1.name+" age："+a1.age);
	a1.eat();//引用类中创建的方法
	a1.sleep();
	
	}
	

}

class Animal {//设计一个类
	String name;//类 的属性成员变量
	int age;

	public void eat() {//类中包含的方法
		System.out.println("动物吃饭");
	}

	public void sleep() {
		System.out.println("动物睡觉");
	}

}