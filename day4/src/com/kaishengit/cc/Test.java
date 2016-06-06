package com.kaishengit.cc;

/*继承，使用关键词extends，一个类只能有一个父类，子类继承父类的属性和方法，父类中private修饰的方法和属性不能继承
 * 创建一个类，类名后面什么都没写的时候默认继承自object类
 * 当本类中方法与父类发生重写的时候，子类对象调用的是子类的方法（就近原则！
 * 重写：子类的方法与父类相同，一般在重写方法前添加@override注解
 * 在子类中调用父类，super.方法名
 * 访问修饰符：
 *① 默认（friendly 同一个包、本类中都可以使用；
 *② private 只能在本类中使用；
 *③protected 同一个包、本类、子类都可以使用；
 *④ public 全部都可以使用。
 * final，方法前加final，此方法不能被重写；类前加final，此类不能被继承，没有子类。
 * 构造方法：实例化子类时会运行子类的抽象方法，没有输入参数时默认执行无参的抽象方法。
 * 建立子类构造方法时，必须先执行父类的构造方法，必须写在第一行。不写，默认执行父类无参的构造方法。
 * 抽象方法abstract：没有方法体，不能被实例化只能被继承，只能出现在抽象类中，不能私有化。
 * 父类是抽象类，子类中必须重写父类中的抽象方法，除非子类也是抽象类！
 * 多态，同一种事物在不同情况下的不同形态，
 * 里氏替换原则，任何基类可以出现的地方，子类都可以出现，父类变量 = 子类对象，Pet p = new Dog()。当父类是抽象类的时，可以实例化子类
 * 关键词instance of,类型转换之前先判断避免类型转换异常，只适用于引用数据类型。格式：变量   instance of 类型
 * 
 */

public class Test {
	public static void main(String[] args) {
		//Pet p = new Dog();// 父类变量，子类类型
		Factory fc = new Factory();
		Pet p = fc.feed("猫");
		p.eat();
		Pet p1 = fc.feed("狗");
		System.out.println(p1 instanceof Cat);
		p1.eat();

	}

}
