package com.ccit.java;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket c = new Socket("127.0.0.1", 8732);
		System.out.println("客户端连接成功！");
		InputStream is = c.getInputStream();
		OutputStream os = c.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(os,true);
		while(true){
			String msg = null ;
			while(msg == null){
				msg = br.readLine();
			}
			System.out.println(msg);
			System.out.print("请输入消息：");
			 msg = sc.next();
			pw.println("客户端：" + msg);
			
		}
			
		 

//		pw.close();
//		c.close();
//		sc.close();
//	
		

		
		
		
		
		
	}

}
