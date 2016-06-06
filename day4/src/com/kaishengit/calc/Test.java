package com.kaishengit.calc;
/*里氏替换原则，任何基类出现的地方，子类都可以出现
 * 基类类型不仅可以作为参数，还可以作为返回类型
 * 基类不能实例化，只能实例化它的子类。
 * 工厂模式：拆分业务，使类与类之间的联系变小，即使一个类修改也不会影响其他类。
 * 基类设置为抽象类，在子类中重写基类的方法@override//抽象类不能被实例化，抽象方法没有方法体！！！
 * 子类可以替换基类---基类 变量名 = new 子类()；
 * public 基类 Factory(String str ){ //**返回值为基类类型
 * 基类 变量名 = null ;//定义一个基类变量，赋初始值为null
 * switch(str){ //当switch内的变量满足下列case的情况时，执行case内的语句
 * case "1" :
 * (基类)变量名 = new 子类1();
 * break;
 * case "2":
 * (基类)变量名 = new 子类2();
 * break;
 * ......
 * }
 * return (基类)变量名；
 * }
 * 关键字instance of，用来判断引用类型数据是否匹配，格式：(基类)变量名 instance of 子类，返回值类型为boolean，
 * 当匹配时结果为true，否则为false
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
