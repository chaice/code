package com.chat.server;

import com.chat.data.Static;
import com.chat.data.UserData;

public class Send implements Runnable {
	public UserData user;

	public Send(UserData user) {
		super();
		this.user = user;
	}

	@Override
	public void run() {
		try {
			while(true){
				String mes = user.getBr().readLine();
				if(mes == null){
					continue;
				}
				for (String name : Static.USER.keySet()) {
					if(!name.equals(user.getName())){
						Static.USER.get(name).getPw().println("��" + user.getName() + "��˵��" + mes);
					}
				}
			}
		} catch (Exception e) {
		  Static.USER.remove(user.getName());
		  String mes = "��" + user.getName() + "���˳�����ǰ��������Ϊ��" + Static.USER.size();
		  System.out.println(mes);
		  for(String name : Static.USER.keySet()){
			  Static.USER.get(name).getPw().println(mes);
		  }
		}

	}

}
