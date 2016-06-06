package com12.chat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com12.chat.data.UserData;
import com12.chat.entity.Account;

public class ChatServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(UserData.POINT);

		while (true) {
			System.out.println("�ȴ��û����ӡ���");
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			String name = br.readLine().trim();

			if (UserData.USERS.keySet().contains(name)) {
				pw.println("40021");
				System.out.println(name + " ����ʧ��...");
			} else {
				pw.println("success");
				System.out.println(name + " ���ӳɹ�...");
				Account user = new Account();
				user.setName(name);
				user.setReader(br);
				user.setWriter(pw);
				UserData.USERS.put(name, user);

				SendMessage sm = new SendMessage(user);
				new Thread(sm).start();

				String msg = "��" + name + "����½����ǰ��������:" + UserData.USERS.size();
				for (String key : UserData.USERS.keySet()) {
					UserData.USERS.get(key).getWriter().println(msg);
				}
			}
		}

	}

}
