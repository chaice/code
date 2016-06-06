package cc.object.oriented.programming;

public class Testlianxiti {
	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.showAge();
	}

}
class Person{
	String name;
	int age;
	int sex;
	public void study(){
		System.out.println("studying");
	}
	public void showAge(){
		System.out.println(age);
	}
	public void addAge(){
		age += 2;
	}
	
}