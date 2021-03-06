package com12.chat.server;

import java.io.IOException;

import com12.chat.data.UserData;
import com12.chat.entity.Account;

public class SendMessage implements Runnable {

	public Account user;

	public SendMessage(Account user) {
		this.user = user;
	}

	@Override
	public void run() {

		try {

			while (true) {
				String msg = user.getReader().readLine();
				if (msg == null || msg.trim().length() == 0) {
					continue;
				}
				for (String name : UserData.USERS.keySet()) {
					if (!name.equals(user.getName())) {
						UserData.USERS.get(name).getWriter().println("【" + user.getName() + "】说:" + msg);
					}
				}
			}

		} catch (IOException e) {
			// e.printStackTrace();
			UserData.USERS.remove(user.getName());
			String msg = user.getName() + "退出,当前在线人数：" + UserData.USERS.size();
			System.out.println(msg);
			for (String name : UserData.USERS.keySet()) {
				UserData.USERS.get(name).getWriter().println("【" + user.getName() + "】说:" + msg);
			}
		}

	}

}
