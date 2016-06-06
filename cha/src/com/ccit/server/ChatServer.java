package com.ccit.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.ccit.data.Static;
import com.ccit.data.UserData;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(Static.PORT);
		while(true){
		System.out.println("等待用户登录...");
		Socket s = ss.accept();
		System.out.println("用户登录成功~");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		String name = br.readLine();
		if(Static.m.keySet().contains(name)){
			pw.println("用户名已存在！");
		}
		else{
			pw.println("登陆成功！");
			UserData user = new UserData();
			user.setName(name);
			user.setBr(br);
			user.setPw(pw);
			Static.m.put(name, user);
			new Thread(new Send(user)).start();
			String mes = "【" + user.getName() + "】上线了，当前在线人数为：" + Static.m.size();
			for (String key : Static.m.keySet()) {
				Static.m.get(key).getPw().println(mes);
			}
		}
		
		
		
		}

	}
}
