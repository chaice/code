package com.chat.server;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.swap(3, 5);
		
	}
	public void swap(int i , int j){
		int temp = i ;
		i = j ;
		j = temp;
		System.out.println("i:" + i + "j:" + j );
	}

}
