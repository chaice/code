package com.chat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.chat.data.ChatData;
import com.chat.data.Static;
/*
 * 
 */
public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(Static.PORT);
		while (true) {
			System.out.println("�ȴ��û���¼...");
			Socket s = ss.accept();
			System.out.println("��½�ɹ���");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			String name = br.readLine();
			if (Static.USER.keySet().contains(name)) {
				pw.println("�û����Ѵ��ڣ�");
			} else {
				pw.println("��½�ɹ���");
				ChatData user = new ChatData();
				user.setName(name);
				user.setBr(br);
				user.setPw(pw);
				Static.USER.put(name, user);
				new Thread(new SentMes(user)).start();
				name = "��" + user.getName() + "�����ߣ���ǰ��������Ϊ��"
						+ Static.USER.size();
				for (String key : Static.USER.keySet()) {
					
						Static.USER.get(key).getPw().println(name);
					
				}
			}
		}
	}

}
