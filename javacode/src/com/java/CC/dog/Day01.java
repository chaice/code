package com.java.CC.dog;
//����ģʽ����ֻ��ʵ����һ��
public class Day01 {
	public static void main(String[] args) {
		Day01 d = new Day01();
		System.out.println(d);
		
	}
	private Day01() {//���췽����˽��
	}
	private static Day01 day = new Day01();//������̬��Ա
	public static Day01 newDay01(){//д��̬�������ⲿ��ȡ
		return day;
	}

}
