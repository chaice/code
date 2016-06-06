package com.ccit.server;

import java.io.IOException;

import com.ccit.data.Static;
import com.ccit.data.UserData;

public class Send implements Runnable {
	private UserData user;

	public Send(UserData user) {
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
				} else {
					for (String name : Static.m.keySet()) {
						if (!user.getName().equals(name)) {
							Static.m.get(name).getPw().println("��" + user.getName() + "��˵��" + mes);
						}
					}
				}
			}
		} catch (IOException e) {
			Static.m.remove(user.getName());
			String mes = "��" + user.getName() + "�����˳�����ǰ��������Ϊ��"
					+ Static.m.size();
			System.out.println(mes);
			for (String name : Static.m.keySet()) {
				Static.m.get(name).getPw().println(mes);
			}

		}

	}

}
