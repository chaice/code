package com.java.CC;
//code��ϰ�Ⲷ��1.
import java.util.Scanner; 
public class chengji {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ��������");
		 int num = s.nextInt();//����Scanner�Ķ��󣬲��Ӽ��̻�ȡѧ���ĸ���
		 int[] socres = new int[num];
		 int maxsocre = 0;
		 System.out.println("������ "+num+" ���ɼ�");
		 for(int i = 0;i<socres.length;i++){
			 int socre = s.nextInt();//���δӼ��̻�ȡѧ���ķ���
			 socres[i] = socre;//��ѧ���ķ�����ֵ��Ԫ��
			 if(socres[i]>maxsocre){//�ҳ����е���߷�
				 maxsocre = socres[i];
			 }
		 }
		 System.out.println("��߷�Ϊ��"+maxsocre);
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
