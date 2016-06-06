package com.java.CC;
//练习题，捕获.png
public class TestPritimive {
	public static void main(String[] args){
		Pritimive d = new Pritimive();//创建Primitive的对象d
		for(int i = 0;i<d.t.length;i++){//遍历数组d的元素
			System.out.println(d.t[i]);
		}
		//给d 的元素重新赋值
		d.t[0] = true;
		d.t[1] = true;
		d.t[2] = true;
		for(int i = 0;i<d.t.length ;i++){
			System.out.println(d.t[i]); 
		}
		
	}

}
class Pritimive{
    boolean[] t = new boolean[3];
}
