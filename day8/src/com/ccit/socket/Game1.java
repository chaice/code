package com.ccit.socket;

import java.io.InputStream;

import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//��ȭ��Ϸ��Game1,Game,BiJiao
public class Game1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(7834);
		Socket s = server.accept();
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		System.out.println("===��ȭ��Ϸ===");
		System.out.println("1.ʯͷ");
		System.out.println("2.����");
		System.out.println("3.��");
		System.out.println("=============");
		System.out.print("��ѡ��");
		int i = sc.nextInt();
		os.write(i);
		int n = is.read();
		System.out.println("�Է���ѡ���ǣ�" + n);
		os.flush();
		server.close();
		sc.close();
		int m = BiJiao.bijiao(n, i);
		if (m == 0) {
			System.out.println("ƽ�֣�");
		} else if (m == 1) {
			System.out.println("�����ˣ�");
		} else if (m == 2)
			System.out.println("��Ӯ�ˣ�");
	}

}
