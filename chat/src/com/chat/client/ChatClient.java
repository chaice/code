package com.chat.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.chat.data.Static;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket(Static.IP, Static.PORT);
		System.out.println("��ӭ���������ң�");
		System.out.print("�������û�����");
		String mes = sc.next();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println(mes);
		mes = br.readLine();
		System.out.println(mes);
		if(mes.equals("��½�ɹ���")){
			new Thread(new Accept(br)).start();
		}
		while(true){
			mes = sc.next();
			pw.println(mes);
		}

	}

}