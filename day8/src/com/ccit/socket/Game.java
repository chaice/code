package com.ccit.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket game = new Socket("127.0.0.1", 7834);
		InputStream is = game.getInputStream();
		OutputStream os = game.getOutputStream();
		System.out.println("===��ȭ��Ϸ===");
		System.out.println("1.ʯͷ");
		System.out.println("2.����");
		System.out.println("3.��");
		System.out.println("=============");
		int n = is.read();
		System.out.println("�Է���ѡ���ǣ�" + n);
		System.out.print("��ѡ��");
		int i = sc.nextInt();
		os.write(i);
		os.flush();
		game.close();
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
