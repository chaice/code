package com.java.CC;
//��ϰ���������
public class Yanghui {
	public static void main(String[] args){
		int[][] yanghui = new int[10][];
		//��ʼ����ά����
		for(int i = 0;i<yanghui.length;i++){
			yanghui[i] = new int[i+1];
			}
		//����ά���鸳ֵ��������
		for(int i = 0;i<yanghui.length;i++){
			for(int j = 0;j<yanghui[i].length;j++){
				yanghui[i][0] = yanghui[i][i] = 1;
				if(1<i&&j>0&&j<i){
					yanghui[i][j] = yanghui[i-1][j]+yanghui[i-1][j-1];
				}
				System.out.print(yanghui[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
