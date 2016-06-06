package com.java.CC.dog;
//单例模式，类只能实例化一次
public class Day01 {
	public static void main(String[] args) {
		Day01 d = new Day01();
		System.out.println(d);
		
	}
	private Day01() {//构造方法的私有
	}
	private static Day01 day = new Day01();//创建静态成员
	public static Day01 newDay01(){//写静态方法让外部获取
		return day;
	}

}
