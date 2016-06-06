package com.ccit.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.ccit.data.Static;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
	    Socket s = new Socket(Static.IP, Static.PORT);
		System.out.print("请输入用户名：");
		String mes = sc.next();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println(mes);
		mes = br.readLine();
		if(mes.equals("登陆成功！")){
			new Thread(new Accept(br)).start();
		}
		while(true){
			mes = sc.next();
			pw.println(mes);
		}
		
		
	}
}
