package com.ccit.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class RunnAble implements Runnable {

	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			ServerSocket server = new ServerSocket(8743);
			Socket s = server.accept();
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintWriter pw = new PrintWriter(os, true);
			while (true) {
				String str = null;
				while (str == null) {
					str = br.readLine();
				}
				System.out.println("øÕªß∂À£∫" + str);
				System.out.print("«Î ‰»Î£∫");
				str = sc.next();
				pw.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
