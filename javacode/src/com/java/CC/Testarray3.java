package com.java.CC;
//遍历二维数组中的元素
public class Testarray3 {
	public static void main(String[] args){
		int[][] array = new int[2][2];
		array[0][0] = 1;
		//array[0][1] = 2;
		//array[1][0] = 3;
		array[1][1] = 4;
		for(int i = 0;i<array.length;i++){//array.length数组的长度
			for(int j =0;j<array[i].length;j++){//array[i].length具体到每个一维数组包含的元素个数
				System.out.println(array[i][j]);
			}
		}
		
	}

}
