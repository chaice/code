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
			System.out.println("等待用户登录...");
			Socket s = ss.accept();
			System.out.println("用户登录成功！");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			String mes = br.readLine();
			if(Static.USER.keySet().contains(mes)){
				pw.println("用户名已存在！");
			}else{
				pw.println("登陆成功！");
				UserData user = new UserData();
				user.setName(mes);
				user.setBr(br);
				user.setPw(pw);
				Static.USER.put(mes, user); 
				new Thread(new Send(user)).start();
				mes = "【" + user.getName() + "】上线了，当前在线人数为：" + Static.USER.size();
				for (String name : Static.USER.keySet()) {
					Static.USER.get(name).getPw().println(mes);
				}
				
			}
		}
	}

}
