package com.chat.server;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.chat.data.Static;
import com.chat.data.UserData;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(Static.PORT);
		while(true){
			System.out.println("�ȴ��û���¼...");
			Socket s = ss.accept();
			System.out.println("�û���¼�ɹ���");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			String mes = br.readLine();
			if(Static.USER.keySet().contains(mes)){
				pw.println("�û����Ѵ��ڣ�");
			}else{
				pw.println("��½�ɹ���");
				UserData user = new UserData();
				user.setName(mes);
				user.setBr(br);
				user.setPw(pw);
				Static.USER.put(mes, user); 
				new Thread(new Send(user)).start();
				mes = "��" + user.getName() + "�������ˣ���ǰ��������Ϊ��" + Static.USER.size();
				for (String name : Static.USER.keySet()) {
					Static.USER.get(name).getPw().println(mes);
				}
				
			}
		}
	}

}
