package com.chat.server;

import java.io.IOException;

import com.chat.data.ChatData;
import com.chat.data.Static;

public class SentMes implements Runnable {
	public ChatData user;

	public SentMes(ChatData user) {
		super();
		this.user = user;
	}

	@Override
	public void run() {
		try {
			while (true) {

				String mes = user.getBr().readLine();
				if (mes == null) {
					continue;
				}
				for (String name : Static.USER.keySet()) {
					if (!name.equals(user.getName())) {
						Static.USER.get(name).getPw()
								.println("【" + user.getName() + "】说：" + mes);
					}
				}

			}
		} catch (IOException e) {
			Static.USER.remove(user.getName());
			String mes = "【" + user.getName() + "】退出，当前在线人数为："+ Static.USER.size();
					
			System.out.println(mes);
			for (String name : Static.USER.keySet()) {
				Static.USER.get(name).getPw().println(mes);
			}

		}

	}

}
