package com.java.CC;

public class Testarray {
     public static void main(String[] args){
    	 int[] i=new int[3];
    	 i[0]=1;
    	 i[1]=2;
    	for(int j =0;j<i.length;j++){//要想遍历数组元素，必须使用循环
		 System.out.println(i[j]); 	 
    	 }
    	String[] strs = new String[]{"aa","bb","cc"};
    	  for(int j=0;j<strs.length;j++){
    	    System.out.println(strs[j]);
    	  }
    	  
     }
     
}
