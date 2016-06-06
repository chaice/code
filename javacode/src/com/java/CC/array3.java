package com.java.CC;
//练习题数组3
import java.util.Arrays;
public class array3 {
	public static void main(String[] args) {
		int[] arr = new int[] {23,45,12,21,41,55};
		/*int max = arr[0];// 不能取0

		for (int i = 0; i < 3; i++) {// 得最大值
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 0; i < 3; i++) {// 求数组的最小值
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int sum = 0;
		double k;
		for (int j = 0; j < 3; j++) {// 求数组的和
			sum += arr[j];
		}
		k = sum / arr.length;
		
		int[] arr1 ;//复制arr的值到arr1内
		arr1 = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
		
		//数组元素的反转
		①：for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			}
		②：for(int x = 0,y = arr.length-1;x<y;x++,y--){
		    int temp = arr[x];
		    arr[x] = arr[y];
		    arr[y] = temp;	
		}
		//数组排序（冒泡排序）从大到小排列
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length -1-i;j++)
				if(arr[j]<arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
		}*/
		//直接排序
		/*①for(int i = 0;i<arr.length-1;i++){
			for(int j = i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}②下面*/
		/*for(int i = 0;i<arr.length-1;i++){
			int t = i;//默认t处值最小
			for(int j = i;j<arr.length;j++){
				if(arr[t]>arr[j]){//一旦发现比默认最小值小的便记下其下角标
					t = j;
				}
			}
			if(t != i){
				int temp = arr[t];
				arr[t] = arr[i];
				arr[i] = temp;
			}
		
	}*/
		Arrays.sort(arr);//java提供的排序（快速排序）
		
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
