package com.java.CC;
//��ϰ������3
import java.util.Arrays;
public class array3 {
	public static void main(String[] args) {
		int[] arr = new int[] {23,45,12,21,41,55};
		/*int max = arr[0];// ����ȡ0

		for (int i = 0; i < 3; i++) {// �����ֵ
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 0; i < 3; i++) {// ���������Сֵ
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int sum = 0;
		double k;
		for (int j = 0; j < 3; j++) {// ������ĺ�
			sum += arr[j];
		}
		k = sum / arr.length;
		
		int[] arr1 ;//����arr��ֵ��arr1��
		arr1 = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
		
		//����Ԫ�صķ�ת
		�٣�for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			}
		�ڣ�for(int x = 0,y = arr.length-1;x<y;x++,y--){
		    int temp = arr[x];
		    arr[x] = arr[y];
		    arr[y] = temp;	
		}
		//��������ð�����򣩴Ӵ�С����
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length -1-i;j++)
				if(arr[j]<arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
		}*/
		//ֱ������
		/*��for(int i = 0;i<arr.length-1;i++){
			for(int j = i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}������*/
		/*for(int i = 0;i<arr.length-1;i++){
			int t = i;//Ĭ��t��ֵ��С
			for(int j = i;j<arr.length;j++){
				if(arr[t]>arr[j]){//һ�����ֱ�Ĭ����СֵС�ı�������½Ǳ�
					t = j;
				}
			}
			if(t != i){
				int temp = arr[t];
				arr[t] = arr[i];
				arr[i] = temp;
			}
		
	}*/
		Arrays.sort(arr);//java�ṩ�����򣨿�������
		
		System.out.print("arr:");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		/*System.out.println(min);
		System.out.println(k);
		System.out.println(sum);
		System.out.println(max);
		*/

	}

}
