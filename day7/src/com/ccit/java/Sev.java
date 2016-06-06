package com.ccit.java;
/*Socket套接字 
 * 通讯过程：
 * ①创建Socket
 * 服务器端:ServerSocket server = new ServerSocket(端口号),
 * Socket s = server.accept 使服务器与客户端连接
 * 客户端：Socket s = new Socket(IP地址，端口号)
 * ②打开Socket传输传入流
 * InputStream is = s.getInputStrean;
 * OutputStream os = s.getOutputStream;
 * is.read() 读取字节流       os.write()写入字节流
 * 文本传输
 * BufferedReader br = new BufferedReader(new InputStreamReader(is));
 * PrintWriter pw = new PrinteWriter(os,true);
 * br.readLine();            pw.println();       
 * ③按照一点的操作对Socket进行读写控制
 * ④关闭Socket
 * 
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//一对一简单聊天工具
public class Sev {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(8732);

		System.out.println("等待客户端连接！");
		Socket s = server.accept();
		System.out.println("客户端连接成功！");
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(os, true);
		while (true) {
			System.out.print("请输入消息：");
			String msg = sc.next();
			pw.println("服务端：" + msg);
			msg = null;
			do {
				msg = br.readLine();
			} while (msg == null);
			System.out.println(msg);

		}

	}

}
