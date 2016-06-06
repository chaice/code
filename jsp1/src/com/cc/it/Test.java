package com.cc.it;

public class Test {
	public static void main(String[] args){
    Test t = new Test();
    System.out.println(t.num(8));
    System.out.println(num(2));
	}
	static int num(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 2;
		}else{
			return num(n-1)+num(n-2);
		}
	}
}
