package com.ccit.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			Socket s = new Socket("127.0.0.1", 8743);
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintWriter pw = new PrintWriter(os, true);
			while (true) {
				System.out.print("«Î ‰»Î£∫");
				String str = sc.next();
				pw.println(str);
				str = br.readLine();
				while (str == null) {
					str = br.readLine();
				}
				System.out.println("∑˛ŒÒ∆˜£∫" + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
