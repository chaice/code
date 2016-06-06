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
			System.out.println("等待用户登录...");
			Socket s = ss.accept();
			System.out.println("登陆成功！");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			String name = br.readLine();
			if (Static.USER.keySet().contains(name)) {
				pw.println("用户名已存在！");
			} else {
				pw.println("登陆成功！");
				ChatData user = new ChatData();
				user.setName(name);
				user.setBr(br);
				user.setPw(pw);
				Static.USER.put(name, user);
				new Thread(new SentMes(user)).start();
				name = "【" + user.getName() + "】上线，当前在线人数为；"
						+ Static.USER.size();
				for (String key : Static.USER.keySet()) {
					
						Static.USER.get(key).getPw().println(name);
					
				}
			}
		}
	}

}
