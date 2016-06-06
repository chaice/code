package com.ccit.java;

public class TestA {
	public static void main(String[] args) {
		int[][] i = new int[3][];
		
		i[0] = new int[1];
		
		i[1] = new int[2];
		i[1][1] = 2;
		i[2] = new int[3];
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[j].length; j2++) {
				System.out.print(i[j][j2]);
			}
		}
	}

}
