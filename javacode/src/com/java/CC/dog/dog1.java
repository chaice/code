package com.java.CC.dog;

/*构造方法无返回值类型与类名相同，调用:new 类名
 * 构造方法重载，类名相同，参数不同(参数个数，参数类型，参数顺序
 * 构造方法没有返回值，不能进行赋值运算
 * 方法重载与构造方法重载一样，方法名相同参数不同
 * 可变参数，必须放在参数列表的最后数据类型必须一致，声明方式：
 * 方法名（参数的类型名...参数名        一个方法只能有一个可变参数
 * 类的静态成员，关键字static
 * 使用static修饰的方法或成员变量为类成员，类成员的使用方式：类名.方法名 来调用
 * 没有使用static 修饰的为对象成员，对象成员的使用方式：对象名.方法名 来调用
 * 静态成员的方法内之能使用静态成员，不能使用对象成员
 * 静态代码块，static{},只能在类第一次初始化执行一次
 * final 关键字，定义常量，名字全部大写，避免无意的修改
 * 单例模式：①构造方法私有②创建静态成员③写静态方法让外界获取。单例模式使
 * 类只能实例化一次。
 */
public class dog1 {
	public static void main(String[] args) {
		User n = new User();
		//n.name = "小狗";
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
	static int age;//类成员
	final double PI = Math.PI;

	public  User() {
		System.out.println("构造方法");
	}

	public User(String name) {
		System.out.println("名字是" + name);
	}

	public static void sayHi() {//类成员
		System.out.println("你好我是" + name);
	}

	public void sayHi(int age) {
		System.out.println("你好我的年龄是：" + age);
	}

	public int sum(int... sums) {//可变参数
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
//		System.out.println("单例模式");
//	}
//	private static User d = new User();
//	public static User newUser(){
//		return d;
//	}

}
