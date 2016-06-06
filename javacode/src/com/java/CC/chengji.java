package com.java.CC;
//code练习题捕获1.
import java.util.Scanner; 
public class chengji {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		 int num = s.nextInt();//创建Scanner的对象，并从键盘获取学生的个数
		 int[] socres = new int[num];
		 int maxsocre = 0;
		 System.out.println("请输入 "+num+" 个成绩");
		 for(int i = 0;i<socres.length;i++){
			 int socre = s.nextInt();//依次从键盘获取学生的分数
			 socres[i] = socre;//将学生的分数赋值给元素
			 if(socres[i]>maxsocre){//找出其中的最高分
				 maxsocre = socres[i];
			 }
		 }
		 System.out.println("最高分为："+maxsocre);
	/*for(int i = 0;i<socres.length;i++){
			if(socres[i]>=(maxsocre-10)){
				System.out.println("student"+i+"socre is"+socres[i]+"grade is"+"A");
			}
			else if(socres[i]>=(maxsocre-20)){
				System.out.println("student"+i+"socre is"+socres[i]+"grade is"+"B");
			}
			else if(socres[i]>=(maxsocre-30)){
				System.out.println("student"+i+"socre is"+socres[i]+"grade is"+"C");
			}
			else{
					System.out.println("student"+i+"socre is"+socres[i]+"grade is"+"D");
			}
		 }
		 */
		 for(int i = 0;i<socres.length;i++){
			 char level;
			 if(socres[i]>=maxsocre-10){
				 level= 'A';
			 }else if(socres[i]>=maxsocre-20){
				level = 'B';
			 }else if(socres[i]>=maxsocre-30){
				 level = 'C';
			 }else{
				 level = 'D';
			 }
			 System.out.println("student "+i+" socre is "+socres[i]+" grade is "+level);
		 }
	}

}
