package com.ccit.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Test  {
	public static void main(String[] args) throws Exception {
		System.out.println("start");
		
		Way w1 = new Way("tom", "12");
		Way w2 = new Way("jom", "12");
		Way w3 = new Way("wom", "12");
		Way w4= new Way("bom", "12");
		Way[] w ={w1,w2,w3,w4};
		File f = new File("e:/text");
		if(!f.exists()){
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f);//序列化
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(w);
		oos.flush();

		oos.close();
		FileInputStream fis = new FileInputStream("e:/text");//反序列化
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Way[] way = (Way[])ois.readObject();
		ois.close();

		
		for (Way way1 : way) {
			System.out.println(way1);
		}
		
		System.out.println("end");
		
	}

}
