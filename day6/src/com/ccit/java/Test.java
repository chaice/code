package com.ccit.java;

import java.util.TreeSet;
/*利用TreeSet自然排序存储自定义类的对象时，必须在自定义类实现comparable接口，并重写compareTo方法
 * TreeSet中添加的必须是同一类的
 */
public class Test {
	
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		s.add(new Person("tom", "12"));
		s.add(new Person("jim", "13"));
		s.add(new Person("tom", "14"));
		TreeSet s1 = new TreeSet();
		
		for (Object object : s) {
			System.out.println(object);
		}

	}

}
