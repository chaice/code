package com.java.CC;
//������ά�����е�Ԫ��
public class Testarray3 {
	public static void main(String[] args){
		int[][] array = new int[2][2];
		array[0][0] = 1;
		//array[0][1] = 2;
		//array[1][0] = 3;
		array[1][1] = 4;
		for(int i = 0;i<array.length;i++){//array.length����ĳ���
			for(int j =0;j<array[i].length;j++){//array[i].length���嵽ÿ��һά���������Ԫ�ظ���
				System.out.println(array[i][j]);
			}
		}
		
	}

}
