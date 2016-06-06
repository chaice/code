package com.chat.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import com.chat.data.Static;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true){
			Socket s = new Socket(Static.IP, Static.PORT);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			System.out.print("请输入用户名：");
			String mes = sc.next();
			pw.println(mes);
			mes = br.readLine();
			System.out.println(mes);
			if(mes.equals("登陆成功！")){
				new Thread(new AccMes(br)).start();
			}
			while(true){
				mes = sc.next();
				pw.println(mes);
			}
		}
	}

}
