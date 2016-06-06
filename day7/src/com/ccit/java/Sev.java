package com.ccit.java;
/*Socket�׽��� 
 * ͨѶ���̣�
 * �ٴ���Socket
 * ��������:ServerSocket server = new ServerSocket(�˿ں�),
 * Socket s = server.accept ʹ��������ͻ�������
 * �ͻ��ˣ�Socket s = new Socket(IP��ַ���˿ں�)
 * �ڴ�Socket���䴫����
 * InputStream is = s.getInputStrean;
 * OutputStream os = s.getOutputStream;
 * is.read() ��ȡ�ֽ���       os.write()д���ֽ���
 * �ı�����
 * BufferedReader br = new BufferedReader(new InputStreamReader(is));
 * PrintWriter pw = new PrinteWriter(os,true);
 * br.readLine();            pw.println();       
 * �۰���һ��Ĳ�����Socket���ж�д����
 * �ܹر�Socket
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
//һ��һ�����칤��
public class Sev {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(8732);

		System.out.println("�ȴ��ͻ������ӣ�");
		Socket s = server.accept();
		System.out.println("�ͻ������ӳɹ���");
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(os, true);
		while (true) {
			System.out.print("��������Ϣ��");
			String msg = sc.next();
			pw.println("����ˣ�" + msg);
			msg = null;
			do {
				msg = br.readLine();
			} while (msg == null);
			System.out.println(msg);

		}

	}

}
