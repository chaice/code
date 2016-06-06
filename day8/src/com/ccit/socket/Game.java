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
		System.out.println("===猜拳游戏===");
		System.out.println("1.石头");
		System.out.println("2.剪刀");
		System.out.println("3.布");
		System.out.println("=============");
		int n = is.read();
		System.out.println("对方的选择是：" + n);
		System.out.print("请选择：");
		int i = sc.nextInt();
		os.write(i);
		os.flush();
		game.close();
		sc.close();
		int m = BiJiao.bijiao(n, i);
		if (m == 0) {
			System.out.println("平局！");
		} else if (m == 1) {
			System.out.println("你输了！");
		} else if (m == 2)
			System.out.println("你赢了！");
	}

}
