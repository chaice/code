package com.ccit.java;

import java.util.Comparator;


public class Test {
	public static void main(String[] args) {
		Comparator com = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					Person p1 = (Person)o1;
					Person p2 = (Person)o2;
					if(p1.getName() == p2.getName()){
						return p1.getAge()-p2.getAge();
					}
				}
				return 0;
			}

			
		};
	}

}
