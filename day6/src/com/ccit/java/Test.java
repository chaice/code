package com.ccit.java;

import java.util.TreeSet;
/*����TreeSet��Ȼ����洢�Զ�����Ķ���ʱ���������Զ�����ʵ��comparable�ӿڣ�����дcompareTo����
 * TreeSet����ӵı�����ͬһ���
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
